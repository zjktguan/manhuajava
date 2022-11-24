
/*
  11.4 对象 示例
 */
// HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        // （1）声明对象类型
        String name;
        // （2）实例化对象
        name = new String("Hello World");

        String name2 = null;
        //输出null字符串
        System.out.println(name2);
        //调用length()方法
        int len = name2.length();

    }
}