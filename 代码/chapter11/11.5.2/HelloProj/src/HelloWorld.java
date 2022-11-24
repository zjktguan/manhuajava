
/*
  11.5.2 构造方法重载 示例
 */
// HelloWorld.java

import com.zhijieketang.Person;

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        Person person = new Person("Tom", 18, new Date());
        System.out.println(person.getInfo());
    }
}