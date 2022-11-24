
/*
 11.3 方法重载 示例
  调用Adder测试方法重载
 */
// HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        // 创建加法器对象
        Adder adder = new Adder();
        int sum1 = adder.add(1, 1);
        int sum2 = adder.add(1, 2, 3);
        double sum3 = adder.add(1.0, 1.0);
        double sum4 = adder.add(1.0, 2.0, 3.0);
        System.out.printf("调用add(int x, int y)方法 = %d%n", sum1);
        System.out.printf("调用add(int x, int y, int z)方法 = %d%n", sum2);
        System.out.printf("调用add(double x, double y)方法 = %f%n", sum3);
        System.out.printf("调用add(double x, double y, double z)方法 = %f%n",
                sum4);
    }
}