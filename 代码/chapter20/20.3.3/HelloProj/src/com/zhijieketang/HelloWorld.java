// com/zhijieketang/HelloWorld.java
package com.zhijieketang;
/*
 * 20.3.3 jsoup库基本用法——常用API
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;


public class HelloWorld {
    // Web网址
    static String strURL = "http://bang.dangdang.com/books/bestsellers";

    public static void main(String[] args) throws Exception {
        Spider spider = new Spider(strURL);
        spider.job();
    }

}