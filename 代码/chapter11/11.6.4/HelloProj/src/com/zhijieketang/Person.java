
/*
  11.6.4 保护级别 示例
 */
// com/zhijieketang/Person.java
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

    protected String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("名字: ").append(name).append('\n');
        sb.append("年龄: ").append(age).append('\n');
        sb.append("出生日期: ").append(birthDate).append('\n');
        return sb.toString();
    }

}