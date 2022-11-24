
/*
 *4.5  变量 示例
 */

public class HelloWorld {

    // 声明int型成员变量
    int y;

    public static void main(String[] args) {

        // 声明int型局部变量
        int x;
        // 声明float型变量并初始化
        float f = 4.5f;

//		x = 10;
        System.out.println("x = " + x);// 编译错误，局部变量 x未初始化
        System.out.println("f = " + f);

        if (f < 10) {
            // 声明型局部变量
            int m = 5;
        }
    }

}
