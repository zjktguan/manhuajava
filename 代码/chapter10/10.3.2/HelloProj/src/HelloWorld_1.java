
/*
 * 10.3.2  不带标签continue语句 示例
 */

public class HelloWorld_1 {
    public static void main(String[] args) {

        //初始化int数组
        int[] intArray = {7, 8, 9, 10};

        for (int item : intArray) {

            if (item == 9) {
                continue;
            }
            // 打印数组元素
            System.out.println(item);
        }
    }
}
