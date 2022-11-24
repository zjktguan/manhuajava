
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 18.4.4 采用匿名内部类实现事件监听器 示例
 */

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {

        //创建窗口对象
        JFrame frame = new MyFrame("我的第一个GUI程序");
        // 设置窗口大小，刚刚好包裹所有组件
        frame.pack();
        // 设置窗口可见
        frame.setVisible(true);
    }
}