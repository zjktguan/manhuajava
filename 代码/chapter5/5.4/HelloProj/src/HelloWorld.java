
/*
 * 5.4 位运算符 示例
 */

public class HelloWorld {
    public static void main(String[] args) {

        byte a = 0b1010;    //十进制10
        byte b = 0b1100;    //十进制12

        System.out.printf("a | b = %d%n", (a | b));         // 十进制14 二进制0b1110
        System.out.printf("a & b = %d%n", (a & b));         // 十进制8 二进制0b1000
        System.out.printf("a ^ b = %d%n", (a ^ b));         // 十进制6 二进制0b110
        System.out.printf("~b = %d%n", (~b));               //  十进制-13

        System.out.printf("a >> 2 = %d%n", (a >> 2));       // 十进制2 二进制0b10
        System.out.printf("a >> 1 = %d%n", (a >> 1));       // 十进制5 二进制0b0101
        System.out.printf("a >>> 2 = %d%n", (a >>> 2));     // 十进制2 二进制0b010
        System.out.printf("a << 2 = %d%n", (a << 2));       // 十进制40 二进制0b101000
        System.out.printf("a << 1 = %d%n", (a << 1));       // 十进制20 二进制0b10100
    }
}
