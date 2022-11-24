
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 19.2.1创建子线程 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread("MyThread");
        // 声明线程执行对象
        Runnable target = null; // TODO 待完成
        Thread thread3 = new Thread(target);
        Thread thread4 = new MyThread();
    }
}

// 自定义线程类
class MyThread extends Thread {
// TODO  待完成
}