
/*
 *7.4.2 二维数组的初始化 示例
 */

public class HelloWorld {
    public static void main(String[] args) {

        // (1) 静态初始化

        // 静态初始化二维数组
        int[][] intArray1 = {
                {1, 2, 3},
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33}};

        // (2) 动态初始化


        // 动态初始化二维数组
        int[][] intArray2 = new int[4][3];
        for (int i = 0; i < intArray1.length; i++) {
            for (int j = 0; j < intArray1[i].length; j++) {
                // 计算平方
                intArray2[i][j] = intArray1[i][j] * intArray1[i][j];
            }
        }

        // 打印数组intArray2
        for (int i = 0; i < intArray2.length; i++) {
            for (int j = 0; j < intArray2[i].length; j++) {
                System.out.printf("intArray2[%d][%d] = %d\t", i, j,
                        intArray2[i][j]);
            }
            System.out.println();
        }
    }
}