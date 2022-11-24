
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 18.6.4 列表 示例
 */

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {

        //创建窗口对象

        JFrame frame = new MyFrame("列表");
        frame.pack();
        // 设置窗口可见
        frame.setVisible(true);
    }
}