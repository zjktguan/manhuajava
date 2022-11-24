/*
 * 8.2 不可变字符串示例
 */
public class HelloWorld {

    public static void main(String[] args) {

        // 创建空字符串对象
        String s1 = new String();
        //通过常量创建字符串Hello World对象
        String s2 = "Hello World";
        //通过new创建字符串Hello World对象
        String s3 = new String("Hello World");

        char chars[] = {'a', 'b', 'c', 'd', 'e'};
        // 通过字符数组创建字符串对象
        String s4 = new String(chars);
        // 通过子字符数组创建字符串对象
        String s5 = new String(chars, 1, 3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s5字符串长度 = " + s5.length());

    }

}
