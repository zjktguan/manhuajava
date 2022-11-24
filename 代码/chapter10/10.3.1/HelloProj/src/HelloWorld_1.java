
/*
 * 10.3.1 不带标签break语句 示例
 */

public class HelloWorld_1 {
    public static void main(String[] args) {

        //初始化int数组
        int[] intArray = {7, 8, 9, 10};

        for (int item : intArray) {

            if (item == 9) {
                break;
            }
            // 打印数组元素
            System.out.println(item);
        }
    }
}
