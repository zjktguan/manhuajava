
/*
 *9.1.2 if-else结构 示例
 */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // 创建Scanner对象
        System.out.println("请输入一个整数：");
        int score = in.nextInt(); // 读取文本并转换为int类型

        if (score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("及格");
        }
    }
}
