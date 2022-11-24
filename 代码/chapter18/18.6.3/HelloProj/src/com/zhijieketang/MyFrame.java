
// zhijieketang/MyFrame.java

/*
 * 18.6.3 复选框 示例
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFrame extends JFrame implements ItemListener {
    public MyFrame(String title) {
        super(title);
        // 设置窗口容器布局为2行1列网格布局
        setLayout(new FlowLayout());
        JLabel label1 = new JLabel("选择你喜欢的编程语言：");
        // 创建复选框
        JCheckBox checkBox1 = new JCheckBox("Java", true);
        JCheckBox checkBox2 = new JCheckBox("C++");
        JCheckBox checkBox3 = new JCheckBox("C");
        // 添加组件
        getContentPane().add(label1);
        getContentPane().add(checkBox1);
        getContentPane().add(checkBox2);
        getContentPane().add(checkBox3);

        //注册ItemEvent事件监听器
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
        checkBox3.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox checkBox = (JCheckBox) e.getSource();
        System.out.printf("复选框：%s 状态为：%b%n",
                checkBox.getText(),
                checkBox.isSelected());

    }
}
