
// zhijieketang/MyFrame.java

/*
 * 18.5.2 边界布局 示例
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        // 设置BorderLayout布局
        setLayout(new BorderLayout(10, 10));

        // 添加按钮到容器的North区域
        getContentPane().add(new Button("NORTH"), BorderLayout.NORTH);
        // 添加按钮到容器的South区域
        getContentPane().add(new Button("SOUTH"), BorderLayout.SOUTH);
        // 添加按钮到容器的East区域
        getContentPane().add(new Button("EAST"), BorderLayout.EAST);
        // 添加按钮到容器的West区域
        getContentPane().add(new Button("WEST"), BorderLayout.WEST);
        // 添加按钮到容器的Center区域
        getContentPane().add(new Button("CENTER"), BorderLayout.CENTER);
    }
}
