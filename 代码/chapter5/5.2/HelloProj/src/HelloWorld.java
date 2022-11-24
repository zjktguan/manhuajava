
/*
 *  5.2	关系运算符 示例
 */

public class HelloWorld {
    public static void main(String[] args) {

        // 基本数据类型比较
        System.out.println("--------比较基本数据类型------");
        int v1 = 1;
        int v2 = 2;

        System.out.printf("v1 == v2 为 %b%n", v1 == v2);
        System.out.printf("v1 != v2 为 %b%n", v1 != v2);
        System.out.printf("v1 > v2 为 %b%n", v1 > v2);
        System.out.printf("v1 < v2 为 %b%n", v1 < v2);
        System.out.printf("v1 <= v2%b%n", v1 <= v2);


        // 引用数据类型比较
        System.out.println("--------比较引用数据类型------");
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = s1;
        System.out.printf("比较s1与s2是否为同一个对象： %b%n", s1 == s2);
        System.out.printf("比较s1与 s2内容是否相同： %b%n", s1.equals(s2));
        System.out.printf("比较s1与s3是否为同一个对象： %b%n", s1 == s3);
    }
}

