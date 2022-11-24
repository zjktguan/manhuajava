// HelloWorld.java

/*
 * 16.2.1 使用URL类 示例
 */

import java.net.*;
import java.io.*;

public class HelloWorld {
    // Web网址
    static String strURL = "https://q.stock.sohu.com/hisHq?code=cn_600519&stat=1&order=D&period=d&callback=historhistorySearchH&rt=jsonp&0.8115656498417958";

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
             InputStreamReader isr = new InputStreamReader(is, "gbk");
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
            System.out.println("返回的数据：");
            System.out.println(sb);
            // 删除historhistorySearchH([字符串
            sb.delete(0, 22);
            System.out.println("删除后的数据：");
            System.out.println(sb);
            // 截掉后面两个字符])
            int pos = sb.indexOf("])");
            sb.delete(pos, sb.length());
            System.out.println("最后的字符串的数据：");
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}