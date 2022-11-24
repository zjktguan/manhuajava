
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 *  19.4.2 	“软着陆 ”停止线程 示例
 */

import java.util.Scanner;

public class HelloWorld {
    // 线程停止变量false 线程运行，true线程停止
    static boolean running = false;

    public static void main(String[] args) {
        // 声明线程执行对象
        Runnable target = () -> {

            //  线程体死循环
            while (!running) {
                System.out.printf("线程：%s开始工作...%n",
                        Thread.currentThread().getName());
                // TODO 下载任务代码
                try {
                    // 线程休眠24小时
                    Thread.sleep(24 * 1000 * 60 * 60);
                    System.out.printf("线程：%s休眠...%n",
                            Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Scanner in = new Scanner(System.in); // 创建Scanner对象
                System.out.println("是否结束线程[y/n]？");
                String string = in.nextLine(); // 读取字符串
                // 忽略大小写判断
                if (string.equalsIgnoreCase("y")) {
                    running = true; //  修改线程停止变量
                }
            }
            System.out.printf("线程：%s结束工作...%n",
                    Thread.currentThread().getName());
            // 线程结束
        };
        Thread thread1 = new Thread(target, "下载线程");
        // 启动线程
        thread1.start();


    }
}