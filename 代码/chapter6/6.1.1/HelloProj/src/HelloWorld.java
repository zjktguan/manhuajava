
/*
 *  6.1.1 整型类型 示例
 */

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("默认整数常量16	=  " + 16);
        byte a = 16;
        short b = 16;
        int c = 16;
        long d = 16L;
        long e = 16l;

        System.out.println("byte整数16 		=  " + a);
        System.out.println("short整数16		=  " + b);
        System.out.println("int整数16		=  " + c);
        System.out.println("long整数16 		=  " + d);
        System.out.println("long整数16 		=  " + e);

        //  整数进制表示
        int decimalInt = 28;
        int binaryInt1 = 0b11100;
        int binaryInt2 = 0B11100;
        int octalInt = 034;
        int hexadecimalInt1 = 0x1C;
        int hexadecimalInt2 = 0X1C;

    }
}


