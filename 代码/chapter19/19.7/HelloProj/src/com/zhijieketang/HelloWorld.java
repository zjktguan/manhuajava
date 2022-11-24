
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 19.7 实践一下：给自己编写时钟程序
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        //创建窗口对象
        MyFrame frame = new MyFrame("我的电子时钟");
        frame.setSize(320, 160);
        // 设置窗口可见
        frame.setVisible(true);

        // 创建线程A
        //
        Thread threadA = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    Date date = new Date();
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    df.format(date);
                    frame.updateLabel(df.format(date));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });
        // 启动线程A
        threadA.start();


    }
}