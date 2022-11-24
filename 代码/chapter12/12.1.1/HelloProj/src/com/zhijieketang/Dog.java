//com/zhijieketang/Dog.java
package com.zhijieketang;
/*
 *12.1.1 方法重写 示例
 */


public class Dog extends Animal {
    // 特长
    private String specialSkill;

    // 两个参数构造方法
    public Dog(int age, boolean sex, String s) {
        // 调用父类构造方法
        super(age, sex);
        this.specialSkill = s;
    }

    @Override
    public void run() {
        System.out.println("狗狗走...");
    }
}

