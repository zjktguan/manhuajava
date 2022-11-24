// HelloWorld.java

/*
 * 16.2.3 实践一下：图片下载器 示例
 */

import java.net.*;
import java.io.*;

public class HelloWorld {
    // 下载图片的Web网址
    static String strURL = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static" +
            "/superman/img/logo/bd_logo1_31bdc765.png";

    public static void main(String[] args) {
        URL reqURL;
        try {
            reqURL = new URL(strURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("下载开始...");
        // HttpURL连接对象
        HttpURLConnection conn = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            // 建立 Http连接
            conn = (HttpURLConnection) reqURL.openConnection();

            // 打开网络通信输入流
            is = conn.getInputStream();

            // 创建文件输出流
            os = new FileOutputStream("./download.png");
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