/*
  11.6.3 公有级别 示例
 */
// HelloWorld.java

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        Person person = new Person("Tom", 18, new Date());
        System.out.println(person.getInfo());
        System.out.println(person.name);
    }
}