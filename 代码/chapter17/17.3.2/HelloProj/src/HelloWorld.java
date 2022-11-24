// HelloWorld.java

/*
 * 17.3.2 遍历Set集合 示例
 */

import java.util.HashSet;
import java.util.Set;

public class HelloWorld {
    public static void main(String[] args) {
        Set set = new HashSet();
        String c = "张三";
        // 向集合中添加元素
        // 添加张三
        set.add(c);
        set.add("李四");
        set.add("王五");
        set.add(c);

        // 1.使用Java风格for循环遍历
        System.out.println("--1.使用Java风格for循环遍历--");
        for (Object item : set) {
            String s = (String) item;
            System.out.println("读取集合元素: " + s);
        }

        // 2.使用forEach()方法遍历
        System.out.println("--2.使用forEach()方法遍历--");
        set.forEach(item -> {
                    System.out.println("读取集合元素: " + item);
                }
        );
    }
}
