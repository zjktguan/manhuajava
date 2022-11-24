
/*
 * 4.6  常量 示例
 */

public class HelloWorld {

    public static final double PI = 3.14;
    // 声明成员常量
    final int y = 10;

    public static void main(String[] args) {
        // 声明局部常量
        final double x = 3.3;

        x = 20; // 编译错误
        System.out.printf("PI =" + PI);

    }

}
