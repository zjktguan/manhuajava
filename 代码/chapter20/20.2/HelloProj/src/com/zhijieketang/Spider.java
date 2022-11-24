// com/zhijieketang/Spider.java
package com.zhijieketang;

/*
 *  20.2 青铜级爬虫
 */

import java.io.*;
import java.net.*;

public class Spider {

    // Web网址
    String strURL = "";

    Spider(String strURL) {
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

        System.out.println("返回的HTML数据：");
        System.out.println(html);

    }


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
}