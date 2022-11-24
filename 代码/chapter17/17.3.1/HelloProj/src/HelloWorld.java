// HelloWorld.java

/*
 * 17.3.1 Set集合常用方法 示例
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
        // 再次添加张三
        set.add(c);

        set.add(123);
        System.out.printf("set集合包含元素个数： %d%n", set.size());
        System.out.printf("set集合内容： %s%n", set);
        // 删除第一个张三
        set.remove(c);
        System.out.printf("删除后set集合内容： %s%n", set);

        System.out.printf("是否包含张三：%b%n", set.contains(c));

        //判断集合是否为空
        System.out.println("set集合是空的：" + set.isEmpty());
    }
}
