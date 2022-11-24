// MoreHelloWorld.java

/*
 * 17.5  泛型 更多使用泛型 示例
 */

import java.util.*;

public class MoreHelloWorld {
    public static void main(String[] args) {
        // List泛型
        List<String> list = new ArrayList<String>();
        String c = "张三";
        // 向集合中添加元素
        // 添加张三
        list.add(c);
        list.add("李四");
        list.add("王五");
//        list.add(123); // 发生编译错误

        // Set泛型
        Set<String> set = new HashSet<String>();
        set.add("董六");
//        set.add(456); // 发生编译错误

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(102, "张三");

//        map.put("Mon", "星期一"); // 发生编译错误

        map.put(1, "Mon");
    }
}
