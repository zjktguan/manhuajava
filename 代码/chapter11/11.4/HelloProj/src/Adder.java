
/*
 * 11.3 方法重载 示例
 * 加法器有多个重载方法
*/

// Adder.java
class Adder {

    // 实现了两个整数相加
    int add(int x, int y) {
        return x + y;
    }

    // 实现了三个整数相加
    int add(int x, int y, int z) {
        return x + y + z;
    }

    // 实现了两个浮点相加
    double add(double x, double y) {
        return x + y;
    }

    // 实现了三个浮点相加
    double add(double x, double y, double z) {
        return x + y + z;
    }
}
