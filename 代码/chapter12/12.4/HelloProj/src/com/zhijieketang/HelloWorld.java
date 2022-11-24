//com/zhijieketang/HelloWorld.java
package com.zhijieketang;
/*
  12.3 接口 示例
 */

public class HelloWorld {
    public static void main(String[] args) {

        // shape1是Shape接口类型，指向子类对象发生多态
        Shape shape1 = new Rectangle();
        shape1.draw();
        // shape2是Shape接口类型指向子类对象发生多态
        Shape shape2 = new Triangle();
        shape2.draw();
        // shape3是Shape接口类型指向子类对象发生多态
        Shape shape3 = new Ellipse();
        shape3.draw();

        // shape4是Rectangle类型，也是Rectangle对象，没有发生多态
        Rectangle shape4 = new Rectangle();
        shape4.draw();

    }
}