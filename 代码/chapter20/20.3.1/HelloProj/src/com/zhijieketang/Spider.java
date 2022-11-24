// com/zhijieketang/Spider.java
package com.zhijieketang;
/*
 * 20.3.1 使用正则表达式
 */

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
        String html = getHTMLData();
        List linkList = getImageLinkList(html);

        // TODO 测试返回的链接内容
        linkList.forEach((link) -> {
            System.out.println(link);
        });
    }

    // 定义获得网站的HTML字符串方法
    String getHTMLData() {
        URL reqURL = null;
        StringBuilder sb = new StringBuilder();
        try {
            reqURL = new URL(strURL);
        } catch (MalformedURLException e) {
            System.out.println("URL格式错误！");
            return null;
        }
        try (// 打开网络通信输入流
             InputStream is = reqURL.openStream();
             InputStreamReader isr = new InputStreamReader(is, "gbk");
             BufferedReader br = new BufferedReader(isr)
        ) {
            // 首次读取一行数据
            String line = br.readLine();
            while (line != null) { // 判断是否数据已经到流的尾部
                sb.append(line).append('\n'); // 添加一个行换行符
                //再次读取一行数据
                line = br.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }


    // 返回图片链接地址
    List<String> getImageLinkList(String inStr) {
        // 定义正则表达式字符串
        String regex = "http://\\S+(?:\\.jpg)";
        // 创建正则表达式对象Pattern
        Pattern pattern = Pattern.compile(regex);
        // 创建 matcher 对象
        Matcher matcher = pattern.matcher(inStr);

        List<String> list = new ArrayList<String>();
        while (matcher.find()) {
            list.add(matcher.group(0));
        }
        return list;
    }
}