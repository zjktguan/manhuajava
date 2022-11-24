
// zhijieketang/MyFrame.java

/*
 * 18.2 你的第一个JavaGUI程序 示例
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) { // title窗口标题
        super(title);
        // 创建标签
        JLabel label = new JLabel("Hello World！");
        label.setFont(new Font("宋体", Font.BOLD, 25));
        // 获得窗口的内容面板
        Container contentPane = getContentPane();
        // 添加标签到内容面板
        contentPane.add(label);
    }
}
