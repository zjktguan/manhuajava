
// zhijieketang/MyFrame.java

/*
 * 18.5.1 流式布局 示例
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    // 声明标签为MyFrame成员变量
    JLabel label;

    public MyFrame(String title) {
        super(title);

        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        // 实例化标签
        label = new JLabel("Hello World！");
        // 创建字体对象
        Font f = new Font("宋体", Font.BOLD, 25);
        label.setFont(f);
        // 获得窗口的内容面板
        Container contentPane = getContentPane();

        // 添加标签到内容面板
        contentPane.add(label);

        // 创建Button1
        JButton button1 = new JButton("Button1");
        button1.setFont(f);
        // 添加Button1到内容面板
        contentPane.add(button1);
        // 注册事件监听器，监听Button1单击事件
        button1.addActionListener(e -> label.setText("世界你好!"));
    }
}
