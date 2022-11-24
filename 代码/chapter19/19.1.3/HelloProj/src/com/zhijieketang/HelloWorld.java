
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 19.1.3 主线程 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        //获取主线程
        Thread mainThread = Thread.currentThread();
        System.out.println("主线程名：" + mainThread.getName());
    }
}