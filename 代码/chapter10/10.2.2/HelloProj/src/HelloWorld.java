
/*
 *10.2.2 C语言风格for循环 示例
 */

public class HelloWorld<j> {
    public static void main(String[] args) {

        //初始化int数组
        int[] intArray = {7, 8, 9, 10};
        for (int i = 0; i < intArray.length; i++) {
            // 打印数组元素
            System.out.printf("intArray[%d] = %d%n", i, intArray[i]);
        }
        // 死循环
//        for (; ; ) {
//            System.out.println("死循环！！！！");
//        }

        // 初始化部分和迭代部分多个操作
        System.out.println("--------初始化部分和迭代部分多个操作-----------");

        for (int x = 0, y = 10; x < y; x++, y--) {
            System.out.printf("(x,y) = (%d, %d)%n", x, y);
        }

    }
}
