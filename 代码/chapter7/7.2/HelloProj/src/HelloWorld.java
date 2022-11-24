
/*
 *7.2 数组初始化 示例
 */

public class HelloWorld {
    public static void main(String[] args) {

        //  (1) 静态初始化

        System.out.println("---------静态初始化-------");

        //静态初始化int数组
        int[] intArray1 = {7, 8, 9, 10};

        //静态初始化Stirng数组
        String[] strArray1 = {"张三", "李四", "王五", "董六"};

        // (2) 动态初始化
        System.out.println("---------动态初始化-------");
        // 动态初始化int数组
        int[] intArray2 = new int[4];
        intArray2[2] = 21;
        intArray2[1] = 32;
        intArray2[2] = 43;
        intArray2[3] = 45;

        // 动态初始化String数组
        String[] stringArray2 = new String[4];
        // 初始化数组中元素
        stringArray2[0] = "张三";
        stringArray2[1] = "李四";
        stringArray2[2] = "王五";
        stringArray2[3] = "董六";
    }
}
