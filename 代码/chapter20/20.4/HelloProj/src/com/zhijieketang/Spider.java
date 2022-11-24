// com/zhijieketang/Spider.java
package com.zhijieketang;
/*
 * 20.4 黄金级爬虫：存储数据
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.*;
import java.util.*;

class Spider {

    // Web网址
    String strURL = "";
    // 下载文件保存的文件夹
    String downloadDir = "";


    public Spider(String strURL, String dir) {
        this.strURL = strURL;
        this.downloadDir = dir;
        System.out.println("爬虫准备就绪。");
        try {
            job();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 爬虫工作方法
    void job() throws Exception {
        System.out.println("爬虫开始工作...");
        List<String> linkList = getImageLinkList();
        for (String link : linkList) {
            download(link);
        }
    }

    // 返回图片链接地址
    List<String> getImageLinkList() throws Exception {
        // 获得文档对象
        Document doc = Jsoup.connect(strURL).get();
        List<String> list = new ArrayList<String>();
        // 通过img标签名查询所有img元素列表
        Elements images = doc.getElementsByTag("img");

        // 遍历img元素
        for (Element image : images) {
            // 获取img元素src属性值
            String src = image.attr("src");
            //判断是否为jpg文件
            if (src.endsWith(".jpg")) {
                list.add(src);
            }
        }
        return list;
    }


    // 根据链接地址列表下载图
    void download(String src) {

        URL reqURL = null;
        try {
            reqURL = new URL(src);
        } catch (Exception ex1) {
            try {
                reqURL = new URL(this.strURL + src);
            } catch (MalformedURLException ex2) {
                ex2.printStackTrace();
            }
        }
        // HttpURL连接对象
        HttpURLConnection conn = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            // 建立 Http连接
            conn = (HttpURLConnection) reqURL.openConnection();
            System.out.println("下载开始...");
            // 打开网络通信输入流
            is = conn.getInputStream();
            // 根据图片连接地址截取图片名
            int pos = src.lastIndexOf("/");
            String fileName = src.substring(pos + 1);
            File dir = new File(this.downloadDir);
            // 如果文件夹不存在，则创建
            if (!dir.exists()) {
                dir.mkdir();
            }
            File file = new File(dir, fileName);
            // 创建文件输出流
            os = new FileOutputStream(file);
            // 准备一个容纳1024个字节的缓冲区
            byte[] buffer = new byte[1024];
            // 首先读取一次
            int len = is.read(buffer);
            while (len != -1) {
                // 写入数据
                os.write(buffer, 0, len);
                // 再次读取
                len = is.read(buffer);
            }

            System.out.println("下载完成。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (conn != null) {
                // 断开连接
                conn.disconnect();
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (os != null) {
                    try {
                        os.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}