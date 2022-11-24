// com/zhijieketang/Spider.java
package com.zhijieketang;
/*
 *  20.6 钻石级爬虫——最终修炼完成！
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

    // 线程停止变量false线程运行，true线程停止
    static boolean running = false;
    MyFrame frame;

    public Spider(String strURL, String dir, MyFrame frame) {
        this.strURL = strURL;
        this.downloadDir = dir;
        this.frame = frame;
    }

    // 爬虫工作方法
    void job() {
        Thread thread1 = new Thread(() -> {
            while (!running) {
                System.out.println("爬虫工作...");
                frame.updateLabel("爬虫工作...");
                try {
                    List<String> linkList = getImageLinkList();
                    // 遍历linkList集合
                    for (String link : linkList) {
                        // 下载图片
                        download(link);
                    }
                    System.out.println("爬虫休眠...");
                    frame.updateLabel("爬虫休眠...");
                    // 线程休眠24小时
                    Thread.sleep(24 * 1000 * 60 * 60);
                } catch (Exception e) {
                    System.out.println("下载失败...");
                    e.printStackTrace();
                    frame.updateLabel("下载失败...");
                }
            }
            System.out.println("爬虫停止...");
            frame.updateLabel("爬虫停止...");
        });
        // 开始线程
        thread1.start();
        running = false;
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
