// HelloWorld.java

/*
 * 14.1.1 分析异常堆栈跟踪信息 示例
 */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // 创建Scanner对象
        System.out.println("请输入一个整数作为分子：");
        int a = in.nextInt();
        System.out.println("请再输入一个整数作为分母：");
        int b = in.nextInt();
        // 除法运算
        int result = divide(a, b);

        System.out.printf("%d除以 %d = %d", a, b, result);
    }

    /**
     * 除法运算
     *
     * @param n1 分子
     * @param n2 分母
     * @return 返回运算结果是整数所以小数部分被截掉
     */
    private static int divide(int n1, int n2) {
        return n1 / n2;
    }
}
