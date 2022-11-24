
// zhijieketang/HelloWorld.java

package com.zhijieketang;
/*
 * 18.4.3 实践一下：事件处理示例 示例
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