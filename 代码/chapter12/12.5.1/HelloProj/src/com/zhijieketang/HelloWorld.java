//com/zhijieketang/HelloWorld.java
package com.zhijieketang;
/*
   12.5.1 匿名内部类 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        Shape shape2 = new Shape() {
            @Override
            public void draw() {
                System.out.println("匿名内部类绘制...");
            }
        };

    }
}