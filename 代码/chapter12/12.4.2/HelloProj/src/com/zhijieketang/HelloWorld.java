//com/zhijieketang/HelloWorld.java
package com.zhijieketang;
/*
   12.4.1 对象类型检查 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        Dog 大黄 = new Dog();
        Animal 小花 = new Cat();

        // 向上转型
        Animal animal1 = (Animal) 大黄;

        // 向下转型
        Animal animal2 = (Cat) 小花;

        // 转换失败抛出异常ClassCastException
        Animal animal3 = (Dog) 小花;
    }
}