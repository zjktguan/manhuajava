
/*
 * 10.1.2 do-while语句 示例
 */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个0~100之间的整数：");
        long num = in.nextLong();
        // 初始化循环变量
        long i = 1;
        do {
            System.out.printf("%d × %d = %d%n", i, i, (i * i));
        } while (++i < num);

    }
}