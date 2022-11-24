
/*
 * 6.1.3 字符类型 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '\u0041';
        char c3 = '中';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        System.out.println("------转义符--------");
        String s = "Hello\tWorld.";
        System.out.println("水平制表符tab1: " + s);
        s = "Hello\u0009World.";
        System.out.println("水平制表符tab2: " + s);
        s = "Hello\nWorld.";
        System.out.println("换行: " + s);
        s = "Hello\rWorld";
    }
}


