
/*
  11.5.2 构造方法重载 示例
 */
// Person.java

package com.zhijieketang;

import java.util.Date;

public class Person {
    // 名字
    private String name;
    // 年龄
    private int age;
    // 出生日期
    private Date birthDate;

    // 三个参数构造方法
    public Person(String name, int age, Date d) {
        this.name = name;
        this.age = age;
        birthDate = d;
    }

    public Person(String n, int a) {
        // 调用三个参数构造方法
        this(n, a, new Date());
    }

    public Person(String n, Date d) {
        name = n;
        age = 30;
        birthDate = d;
    }

    public Person(String n) {
        name = n;
        age = 30;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("名字: ").append(name).append('\n');
        sb.append("年龄: ").append(age).append('\n');
        sb.append("出生日期: ").append(birthDate).append('\n');
        return sb.toString();
    }

}
