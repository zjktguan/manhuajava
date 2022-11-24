
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 18.5.3 网格布局 示例
 */

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {

        //创建窗口对象
        JFrame frame = new MyFrame("网格布局");
        // 设置窗口大小，刚刚好包裹所有组件
        frame.pack();
        // 设置窗口可见
        frame.setVisible(true);
    }
}