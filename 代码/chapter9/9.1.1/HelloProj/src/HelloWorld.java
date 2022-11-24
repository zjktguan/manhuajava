
/*
 *9.1.1 if结构 示例
 */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // 创建Scanner对象
        System.out.println("请输入一个整数：");
        int score = in.nextInt(); // 读取文本并转换为int类型
        if (score >= 85) {
            System.out.println("您真优秀！");
        }
        if (score < 60)
            System.out.println("您需要加倍努力！");

        if ((score >= 60) && (score < 85)) {
            System.out.println("您的成绩还可以，仍需继续努力！");
        }

    }
}
