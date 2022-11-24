// com/zhijieketang/Spider.java
package com.zhijieketang;
/*
 * 20.3.3 jsoup库基本用法——常用API
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Spider {

    // Web网址
    String strURL = "";

    public Spider(String strURL) {
        this.strURL = strURL;
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
            // TODO 测试返回的链接内容
            System.out.println(link);
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
}