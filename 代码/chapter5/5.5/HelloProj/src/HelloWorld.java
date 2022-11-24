
/*
 *5.5 赋值运算符 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a += b;    // 相当于 a = a + b
        System.out.println(a);
        byte a2 = 0;
        byte b2 = 0b1100;
        a2 &= b2;
        System.out.println(a2);

    }
}
