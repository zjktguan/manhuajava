
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 *  19.4.1 死循环与“劳模 ”线程 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        // 声明线程执行对象
        Runnable target = () -> {

            //  线程体死循环
            while (true) {
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
            }
        };
        Thread thread1 = new Thread(target, "下载线程");
        // 启动线程
        thread1.start();
    }
}