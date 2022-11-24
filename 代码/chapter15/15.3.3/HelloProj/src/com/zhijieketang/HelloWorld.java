package com.zhijieketang;
//com/zhijieketang/HelloWorld.java

/*
 * 15.3.3 实践一下：文件复制Tools 示例
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelloWorld {

    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("./a/build.txt");
            File outFile = new File("./b/build.txt");
            out = new FileOutputStream(outFile);
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
        } finally {
            // 释放资源
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}