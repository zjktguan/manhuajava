
/*
 * 10.3.1 带标签break语句 示例
 */

public class HelloWorld_2 {
    public static void main(String[] args) {

        label1:
        for (int x = 0; x < 3; x++) {
            label2:
            for (int y = 3; y > 0; y--) {
                if (y == x) {
                    //跳转到label1指向的循环
                    break label1;
                }
                System.out.printf("(x,y) = (%d,%d)", x, y);
                // 打印一个换行符，实现换行
                System.out.println();
            }
        }
        System.out.println("比赛结束!");

    }
}
