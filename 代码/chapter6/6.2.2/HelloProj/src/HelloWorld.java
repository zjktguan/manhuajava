
/*
 * 6.2.2 强制类型转换 示例
 */

public class HelloWorld {
    public static void main(String[] args) {

        //int型变量
        int i = 10;
        //把int变量i强制转换为byte
        byte b = (byte) i;

        // 不需要强制转换
        int i1 = (int) i;
        int i2 = (int) b;

        float c1 = i / 3;
        System.out.println("c1=" + c1);
        //把int变量i强制转换为float
        float c2 = (float) i / 3;
        System.out.println("c2=" + c2);

        // 精度丢失
        long yourNumber = 6666666666L;
        System.out.println(yourNumber);
        int myNuber = (int) yourNumber;
        System.out.println(myNuber);

    }
}
