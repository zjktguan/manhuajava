// HelloWorld.java

/*
 * 17.2.2 遍历List集合 示例
 */

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List list = new ArrayList();
        String c = "张三";
        // 向集合中添加元素
        // 添加张三
        list.add(c);
        list.add("李四");
        list.add("王五");
        // 再次添加张三
        list.add(c);

        // 1.使用C语言风格for循环遍历
        System.out.println("--1.使用C语言风格for循环遍历--");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("读取集合元素(%s): %s %n", i, list.get(i));
        }

        // 2.使用Java风格for循环遍历
        System.out.println("--2.使用Java风格for循环遍历--");
        for (Object item : list) {
            String s = (String) item;
            System.out.println("读取集合元素: " + s);
        }

        // 3.使用forEach()方法遍历
        System.out.println("--3.使用forEach()方法遍历--");
        list.forEach(item -> {
                    System.out.println("读取集合元素: " + item);
                }
        );
    }
}
