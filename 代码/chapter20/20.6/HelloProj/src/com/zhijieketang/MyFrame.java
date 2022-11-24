
// zhijieketang/MyFrame.java

/*
 *  20.6 钻石级爬虫——最终修炼完成！
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    // 标签
    JLabel label;

    public MyFrame(String title) { // title窗口标题
        super(title);
        // Web网址
        String strURL = "http://bang.dangdang.com/books/bestsellers";
        // 下载文件保存的文件夹
        String downloadDir = "D:\\download";
        // 创建标签
        this.label = new JLabel("日志信息");
        // 获得窗口的内容面板
        Container contentPane = getContentPane();

        // 添加标签到内容面板
        contentPane.add(label, BorderLayout.NORTH);
        JButton button1 = new JButton("开始");
        JButton button2 = new JButton("停止");
        JPanel panel1 = new JPanel();
        panel1.add(button1);
        panel1.add(button2);

        contentPane.add(panel1, BorderLayout.CENTER);

        button1.addActionListener(e -> {
            button1.setEnabled(false);
            button2.setEnabled(true);

            Spider spider = new Spider(strURL, downloadDir, this);
            spider.job();
        });
        button2.addActionListener(e -> {
            button1.setEnabled(true);
            button2.setEnabled(false);
            Spider.running = true;
        });
    }

    public void updateLabel(String txt) {
        this.label.setText(txt);
    }
}