// HelloWorld.java

/*
 * 17.4.1 Map集合常用方法 示例
 */

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(102, "张三");
        map.put(103, "李四");
        map.put(104, "王五");
        map.put(105, "董六");
        //李四值重复，但是键不重复，可以添加
        map.put(106, "李四");
        // 打印集合元素个数
        System.out.println("集合size = " + map.size());
        // 打印集合
        System.out.println(map);
        //102键已经存在，替换原来值张三
        map.put(102, "刘备");
        System.out.println("获得106键对应的值：" + map.get(106));
        // 删除键值对
        map.remove(106);
        // 判断键集合中是否包含106
        System.out.println("键集合中是否包含106：" + map.containsKey(106));
        System.out.println("获得106键对应的值：" + map.get(106));
        // 判断值集合中是否包含 李四
        System.out.println("值集合中是否包含李四：" + map.containsValue("李四"));
        // 清空集合
        map.clear();
        // 判断集合是否为空
        System.out.println("集合是空的：" + map.isEmpty());
    }
}
