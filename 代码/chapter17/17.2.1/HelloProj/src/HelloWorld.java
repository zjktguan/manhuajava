// HelloWorld.java

/*
 * 17.2.1 List集合常用方法 示例
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

        list.add(123);
        System.out.printf("list集合包含元素个数： %d%n", list.size());
        System.out.printf("list集合内容： %s%n", list);
        // 删除第一个张三
        list.remove(c);
        System.out.printf("删除后list集合内容： %s%n", list);

        System.out.printf("是否包含张三：%b%n", list.contains(c));

        //从前往后查找集合中张三
        int pos = list.lastIndexOf(c);
        System.out.printf("找到索引： %d%n", pos);
        //从后往前查找集合中的张三
        pos = list.indexOf(c);
        System.out.printf("找到索引： %d%n", pos);

        //判断集合是否为空
        System.out.println("list集合是空的：" + list.isEmpty());
        // 清空集合
        list.clear();
    }
}
