package com.zhijieketang;
// com.zhijieketang/HelloWorld.java
/*
 * 20.3.1 使用正则表达式
 */

import com.zhijieketang.Spider;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.regex.*;

public class HelloWorld {
    // Web网址
    static String strURL = "http://bang.dangdang.com/books/bestsellers";


    public static void main(String[] args) throws Exception {
        Spider spider = new Spider(strURL);
        spider.job();
    }

}