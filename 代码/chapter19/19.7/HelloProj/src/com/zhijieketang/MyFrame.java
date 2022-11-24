
// zhijieketang/MyFrame.java

/*
 * 19.7 实践一下：给自己编写时钟程序
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    // 标签
    private JLabel label;

    public MyFrame(String title) { // title窗口标题
        super(title);
        // 创建标签
        this.label = new JLabel();
        this.label.setFont(new Font("宋体", Font.BOLD, 25));
        // 获得窗口的内容面板
        Container contentPane = getContentPane();
        // 添加标签到内容面板
        contentPane.add(this.label);

    }

    /**
     * 更新电子时钟
     *
     * @param txt
     */
    void updateLabel(String txt) {
        this.label.setText(txt);
    }
}
