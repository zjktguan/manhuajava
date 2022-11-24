
/*
  11.6.1 私有级别 示例
 */
//com/zhijieketang/HelloWorld.java

import com.zhijieketang.Person;

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        Person person = new Person("Tom", 18, new Date());
        System.out.println(person.getInfo());
        System.out.println(person.name); //编译错误
    }
}