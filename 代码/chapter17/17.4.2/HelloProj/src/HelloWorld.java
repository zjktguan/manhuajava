// HelloWorld.java

/*
 * 17.4.2 遍历Map集合 示例
 */

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(102, "张三");
        map.put(105, "李四");
        map.put(109, "王五");
        map.put(110, "董六");
        map.put(111, "李四");

        System.out.println("--1.遍历键集合--");
        for (Object item :
                map.keySet()) {
            System.out.println("键：" + item);

        }
        System.out.println("--2.遍历值集合--");
        for (Object item :
                map.values()) {
            System.out.println("值：" + item);

        }
        System.out.println("--3.使用forEach方法遍历--");
        map.forEach((k, v) -> {
            System.out.printf("map的键为：%s - 值为：%s%n", k, v);
        });

    }

}