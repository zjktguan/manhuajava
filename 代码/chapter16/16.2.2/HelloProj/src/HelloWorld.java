// HelloWorld.java

/*
 * 16.2.2 HttpURLConnection类  示例
 */

import java.net.*;
import java.io.*;

public class HelloWorld {
    // Web网址
    static String strURL = "https://www.sohu.com/";

    public static void main(String[] args) {
        URL reqURL;
        try {
            reqURL = new URL(strURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }

        // HttpURL连接对象
        HttpURLConnection conn = null;
        InputStream is = null;
        try {
            // 建立 Http连接
            conn = (HttpURLConnection) reqURL.openConnection();
            // 设置HTTP请求Get方法
            conn.setRequestMethod("GET");

            // 打开网络通信输入流
            is = conn.getInputStream();
            // 通过is创建InputStreamReader对象
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            // 通过isr创建BufferedReader对象
            BufferedReader br = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            // 首次读取一行数据
            String line = br.readLine();
            while (line != null) { // 判断是否数据已经到流的尾部
                sb.append(line).append('\n'); // 添加一个行换行符
                //再次读取一行数据
                line = br.readLine();
            }
            // 打印数据
            System.out.println(sb);


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

            }
        }
    }
}