// com/zhijieketang/HelloWorld.java
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

public class HelloWorld {
    // Web网址
    static String strURL = "http://bang.dangdang.com/books/bestsellers";

    // 下载文件保存的文件夹
    static String downloadDir = "d:\\download";

    public static void main(String[] args) throws Exception {
        Spider spider = new Spider(strURL, downloadDir);
        spider.job();
    }
}
