// HelloWorld.java

/*
 * 16.2.1 使用URL类 示例
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

        try (// 打开网络通信输入流
             InputStream is = reqURL.openStream();
             InputStreamReader isr = new InputStreamReader(is, "utf-8");
             BufferedReader br = new BufferedReader(isr)
        ) {
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
        }

    }
}