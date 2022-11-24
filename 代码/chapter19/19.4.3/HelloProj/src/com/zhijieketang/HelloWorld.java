
// zhijieketang/HelloWorld.java

package com.zhijieketang;

/*
 *  19.4.3 我等你不见不散——等待线程其他结束 示例
 */
public class HelloWorld {

    //共享变量
    static int value = 0;

    public static void main(String[] args)  throws InterruptedException {
        System.out.println("A线程 开始执行...");
        // 声明线程执行对象
        Runnable target = () -> {
            System.out.println("B线程 开始执行...");
            for (int i = 0; i < 5; i++) {
                System.out.printf("线程：%s第%d次执行...%n",
                        Thread.currentThread().getName(), i + 1);
                // B线程中修改变量value
                value++;
                try {
                    // 线程休眠1秒钟
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("B线程 结束...");
        };
        Thread threadB = new Thread(target);
        // 启动线程
        threadB.start();
        System.out.println("A线程被阻塞，等待B线程结束");
        // A线程被阻塞，等待B线程结束

        try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("value = %d%n", value);
        System.out.println("A线程 结束...");

    }
}