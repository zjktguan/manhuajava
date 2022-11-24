// com/zhijieketang/b/Student.java
/*
  11.6.4 保护级别 示例
 */

package com.zhijieketang.b;

import com.zhijieketang.Person;

import java.util.Date;

public class Student extends Person {
    public Student(String name, int age, Date d) {
        // 调用父类构造方法
        super(name, age, d);

    }

    void display() {
        System.out.println(this.getInfo());
    }
}
