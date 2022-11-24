package com.zhijieketang;

import javax.swing.*;

public class MyFrame {
    private JPanel panel1;
    private JTextArea textArea1;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame");
        frame.setContentPane(new MyFrame().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
