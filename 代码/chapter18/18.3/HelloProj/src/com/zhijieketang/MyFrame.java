
// zhijieketang/MyFrame.java

/*
 * 18.3	添加更多组件 示例
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        // 创建标签
        JLabel label = new JLabel("Hello World！");
        // 创建字体对象
        Font f = new Font("宋体", Font.BOLD, 25);
        label.setFont(f);
        // 获得窗口的内容面板
        Container contentPane = getContentPane();
        // 添加标签到内容面板
        contentPane.add(label, BorderLayout.NORTH);

        // 创建Button1
        JButton button1 = new JButton("Button1");
        button1.setFont(f);
        // 添加Button1到内容面板
        contentPane.add(button1, BorderLayout.CENTER);

        // 创建Button2
        JButton button2 = new JButton("Button2");
        button2.setFont(f);
        // 添加Button2到内容面板
        contentPane.add(button2, BorderLayout.SOUTH);

    }
}
