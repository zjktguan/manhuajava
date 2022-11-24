
// zhijieketang/MyFrame.java

/*
 * 18.6.4 列表 示例
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {
    // 列表中数据
    static String[] data = {"Java", "C++", "C"};

    public MyFrame(String title) {
        super(title);
        // 设置窗口容器布局为流式布局
        setLayout(new FlowLayout());
        JLabel label1 = new JLabel("选择你喜欢的编程语言：");
        getContentPane().add(label1, BorderLayout.NORTH);

        // 列表组件JList
        JList list1 = new JList(data);
        getContentPane().add(list1, BorderLayout.CENTER);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // 注册项目选择事件侦听器，采用Lambda表达式。
        list1.addListSelectionListener(e -> {
            // 判断鼠标释放
            if (!e.getValueIsAdjusting()) {
                JList list = (JList) e.getSource();
                // 获得选择的内容
                String itemString = (String) list.getSelectedValue();
                System.out.println("选择的内容：" + itemString);
            }
        });
    }
}
