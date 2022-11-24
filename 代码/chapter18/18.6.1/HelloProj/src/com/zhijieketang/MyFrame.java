
// zhijieketang/MyFrame.java

/*
 * 18.6.1 本输入组件 示例
 */

package com.zhijieketang;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);

        // 设置流式布局
        setLayout(new FlowLayout());
        // 创建标签
        JLabel lblTextFieldLabel = new JLabel("用户名:");
        getContentPane().add(lblTextFieldLabel);
        // 创建文本框
        JTextField textField = new JTextField(10);
        getContentPane().add(textField);
        // 创建标签
        JLabel lblPasswordLabel = new JLabel("密码:");
        getContentPane().add(lblPasswordLabel);
        // 创建密码框
        JPasswordField passwordField = new JPasswordField(10);
        getContentPane().add(passwordField);
        // 创建标签
        JLabel lblTextAreaLabel = new JLabel("TextArea:");
        getContentPane().add(lblTextAreaLabel);
        // 创建文本区
        JTextArea textArea = new JTextArea(8, 10);
        getContentPane().add(textArea);

        passwordField.addActionListener((e -> {
            textArea.setText(textField.getText());
            textArea.append("\n"); // 追加换行符
            textArea.append(new String(passwordField.getPassword()));
            textArea.append("\n");
        }));
    }
}
