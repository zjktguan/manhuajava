
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 18.2 你的第一个JavaGUI程序 示例
 */

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {

        //创建窗口对象
        JFrame frame = new MyFrame("我的第一个GUI程序");
        // 设置窗口大小
        frame.setSize(380, 100);
        // 设置窗口可见
        frame.setVisible(true);
    }
}