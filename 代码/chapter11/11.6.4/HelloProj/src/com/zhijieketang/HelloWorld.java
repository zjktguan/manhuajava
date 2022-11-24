// com/zhijieketang/HelloWorld.java
package com.zhijieketang;

/*
  11.6.4 保护级别 示例
 */

import com.zhijieketang.Person;

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        Person person = new Person("Tom", 18, new Date());
        System.out.println(person.getInfo());
    }
}
