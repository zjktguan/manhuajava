package com.zhijieketang;
//com/zhijieketang/HelloWorld.java

/*
 *15.4.3 实践一下：使用字符流重构文件复制Tools 示例
 */


import java.io.*;

public class HelloWorld {

    public static void main(String[] args) {
        File outFile = new File("./b/build.txt");
        try (
                FileReader in = new FileReader("./a/build.txt");
                FileWriter out = new FileWriter(outFile);
        ) {

            // 准备一个容纳8个字符的缓冲区
            char[] buffer = new char[8];
            int count = 0;

            // 首先读取一次
            int len = in.read(buffer);
            // 记取读取文件次数+1
            count++;
            // 将字符数组转换为字符串对象
            String inStr = new String(buffer);
            System.out.printf("第%d次读取%d个字符，缓存内容：%s%n",
                    count, len, inStr);
            while (len != -1) { // 判断是否读取到文件尾部
                // 写入数据
                out.write(buffer, 0, len);
                // 再次读取
                len = in.read(buffer);
                // 记取读取文件次数+1
                count++;
                // 将字符数组转换为字符串对象
                inStr = new String(buffer);
                System.out.printf("第%d次读取%d个字符，缓存内容：%s%n",
                        count, len, inStr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}