// com/zhijieketang/HelloWorld.java
package com.zhijieketang;
/*
 *  20.2 青铜级爬虫
 */

public class HelloWorld {
    // 当当网图书畅销榜网址
    static String strURL = "http://bang.dangdang.com/books/bestsellers";


    public static void main(String[] args) throws Exception {
        Spider spider = new Spider(strURL);
        spider.job();
    }
}