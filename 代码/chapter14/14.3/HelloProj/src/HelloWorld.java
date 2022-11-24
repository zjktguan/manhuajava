// HelloWorld.java

/*
 * 14.3 释放资源 示例
 */

import java.text.*;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Date date = readDate();
        System.out.println(date);
    }

    // 从控制台读取字符串返回日期对象
    public static Date readDate() {
        Scanner in = new Scanner(System.in); // 创建Scanner对象
        System.out.println("请输入一个有效的日期(格式yyyy-MM-dd)：");
        // 从控制台读字符串
        String strDate = in.nextLine();
        return parseStrDate(strDate);
    }

    // 解析字符串方法
    public static Date parseStrDate(String strDate) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            // 从字符串中解析日期
            date = df.parse(strDate);
        } catch (ParseException e) {
            // 处理异常
            e.printStackTrace();
        } finally {
            // 编写释放资源代码...
            System.out.println("释放资源...");
        }
        return date;
    }
}