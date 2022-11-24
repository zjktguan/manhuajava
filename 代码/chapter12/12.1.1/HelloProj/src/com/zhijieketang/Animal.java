//com/zhijieketang/Animal.java
package com.zhijieketang;
/*
 *12.1.1 方法重写 示例
 */
class Animal {
    //动物年龄
    int age = 1;
    //动物性别
    public boolean sex = false;

    // 两个参数构造方法
    public Animal(int age, boolean sex) {
        this.age = age;
        this.sex = sex;
    }


    public void eat() {
        System.out.println("吃东西...");
    }

    protected void run() {

        System.out.println("走...");
    }
}