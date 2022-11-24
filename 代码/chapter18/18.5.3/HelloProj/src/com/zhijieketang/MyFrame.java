
// zhijieketang/MyFrame.java

/*
 * 18.5.3 网格布局 示例
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        // 设置3行3列的GridLayout布局管理器
        setLayout(new GridLayout(3, 3));

        // 添加按钮到第一行的第一格
        getContentPane().add(new Button("1"));
        // 添加按钮到第一行的第二格
        getContentPane().add(new Button("2"));
        // 添加按钮到第一行的第三格
        getContentPane().add(new Button("3"));
        // 添加按钮到第二行的第一格
        getContentPane().add(new Button("4"));
        // 添加按钮到第二行的第二格
        getContentPane().add(new Button("5"));
        // 添加按钮到第二行的第三格
        getContentPane().add(new Button("6"));
        // 添加按钮到第三行的第一格
        getContentPane().add(new Button("7"));
        // 添加按钮到第三行的第二格
        getContentPane().add(new Button("8"));
        // 添加按钮到第三行的第三格
        getContentPane().add(new Button("9"));
    }
}
