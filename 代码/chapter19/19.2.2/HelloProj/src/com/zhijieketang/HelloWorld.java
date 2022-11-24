
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 19.2.2 线程执行对象 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        // 声明线程执行对象
        Runnable target = new Runner();
        Thread thread1 = new Thread(target);
        // 启动线程
        thread1.start();
    }
}

//线程执行类
class Runner implements Runnable {

    @Override
    public void run() { // 线程体 编写执行线程代码
        for (int i = 0; i < 5; i++) {
            // 打印次数和线程的名字
            System.out.printf("线程：%s第%d次执行...%n",
                    Thread.currentThread().getName(), i + 1);
            try {
                // 线程休眠1秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}