
// zhijieketang/MyFrame.java

/*
 * 18.6.2 收音机按钮 示例
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
        setLayout(new GridLayout(2, 1));

        // 创建一个面板panel1
        JPanel panel1 = new JPanel();
        // 设置panel1布局
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        // 创建一个面板panel2
        JPanel panel2 = new JPanel();
        // 设置panel2布局
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        getContentPane().add(panel1);
        getContentPane().add(panel2);
        JLabel label1 = new JLabel("选择你喜欢的编程语言：");

        // 创建收音机按钮
        JRadioButton rdb1 = new JRadioButton("Java");
        JRadioButton rdb2 = new JRadioButton("C++");
        JRadioButton rdb3 = new JRadioButton("C");
        //创建ButtonGroup对象
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rdb1);
        buttonGroup1.add(rdb2);
        buttonGroup1.add(rdb3);
        panel1.add(label1);
        panel1.add(rdb1);
        panel1.add(rdb2);
        panel1.add(rdb3);
        // 创建标签
        JLabel label2 = new JLabel("选择性别：");
        Icon icon0 = new ImageIcon("./images/0.png");
        Icon icon1 = new ImageIcon("./images/1.png");
        JRadioButton rdb4 = new JRadioButton("男", icon1);
        JRadioButton rdb5 = new JRadioButton("女", icon0, true);
        //创建ButtonGroup对象
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(rdb4);
        buttonGroup2.add(rdb5);

        panel2.add(label2);
        panel2.add(rdb4);
        panel2.add(rdb5);

        //注册ItemEvent事件监听器
        rdb4.addItemListener(this);
        rdb5.addItemListener(this);
        rdb1.addItemListener(this);
        rdb2.addItemListener(this);
        rdb3.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getStateChange() == ItemEvent.SELECTED) {
            JRadioButton button = (JRadioButton) e.getSource();
            System.out.println(button.getText());
        }

    }
}
