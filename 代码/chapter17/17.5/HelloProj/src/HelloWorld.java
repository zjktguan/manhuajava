// HelloWorld.java

/*
 * 17.5  泛型 未使用泛型示例
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
        list.add(c);

        list.add(123);
        for (Object item : list) {
            String s = (String) item;
            System.out.println("读取集合元素: " + s);
        }

    }
}
