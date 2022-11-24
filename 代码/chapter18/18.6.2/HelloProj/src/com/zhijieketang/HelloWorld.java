
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 18.6.2 收音机按钮 示例
 */

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {

        //创建窗口对象

        JFrame frame = new MyFrame("收音机按钮");
        frame.pack();
        // 设置窗口可见
        frame.setVisible(true);
    }
}