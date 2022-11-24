// HelloWorld.java

/*
 * 15.5.1 实践一下：中介流实例日期解析器 示例
 */

import java.io.*;
import java.text.*;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        String strDate = readDate();
        Date date = parseStrDate(strDate);
        System.out.printf("" + date);

    }

    // 从文件中读取日期字符串
    public static String readDate() {
        try (
                FileInputStream is = new FileInputStream("Data.txt");
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader bufferedReader = new BufferedReader(isr);
        ) {
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }

    // 解析字符串方法
    public static Date parseStrDate(String strDate) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            // 从字符串中解析日期
            date = df.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}