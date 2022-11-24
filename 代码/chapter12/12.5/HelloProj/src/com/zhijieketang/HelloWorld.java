// HelloWorld.java
package com.zhijieketang;
/*
  12.5 内部类 示例
 */


class 海螺 {

    // 海螺类成员变量
    int age;

    // 海螺类成员方法
    void move() {
        System.out.println("海螺移动中...");

        寄居蟹 蟹老板 = new 寄居蟹();
        蟹老板.move();
    }

    class 寄居蟹 {
        // 寄居蟹类成员变量
        int age;

        // 寄居蟹类成员方法
        void move() {
            System.out.println("寄居蟹移动中...");
        }
    }
}


public class HelloWorld {
    public static void main(String[] args) {
        海螺 小螺 = new 海螺();
        小螺.move();
    }
}

