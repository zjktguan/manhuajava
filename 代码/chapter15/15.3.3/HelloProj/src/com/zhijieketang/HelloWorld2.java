package com.zhijieketang;
//com/zhijieketang/HelloWorld2.java

/*
 * 15.3.3 实践一下：文件复制Tools 自动资源管理 示例
 */


import java.io.*;

public class HelloWorld2 {

    public static void main(String[] args) {
        File outFile = new File("./b/build.txt");
        try (
                FileInputStream in = new FileInputStream("./a/build.txt");
                FileOutputStream out = new FileOutputStream(outFile);
        ) {

            // 准备一个容纳8个字节的缓冲区
            byte[] buffer = new byte[8];
            // 记录读取读取文件次数变量用于测试
            int count = 0;

            // 首先读取一次
            int len = in.read(buffer);
            // 记取读取文件次数+1
            count++;
            // 将字节数组转换为字符串对象
            String inStr = new String(buffer);
            System.out.printf("第%d次读取%d个字节，缓存内容：%s%n",
                    count, len, inStr);
            while (len != -1) { // 判断是否读取到文件尾部
                // 写入数据
                out.write(buffer, 0, len);
                // 再次读取
                len = in.read(buffer);
                // 记取读取文件次数+1
                count++;
                // 将字节数组转换为字符串对象
                inStr = new String(buffer);
                System.out.printf("第%d次读取%d个字节，缓存内容：%s%n",
                        count, len, inStr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}