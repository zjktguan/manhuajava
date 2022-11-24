//com/zhijieketang/HelloWorld.java
package com.zhijieketang;

/*
 *   13.2 Lambda表达式 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;

        // 实现加法计算Calculable对象
        Calculable f1 = calculate('+');
        // 实现减法计算Calculable对象
        Calculable f2 = calculate('-');

        // 调用calculateInt方法进行加法计算
        System.out.printf("%d + %d = %d %n", n1, n2,
                f1.calculateInt(n1, n2));
        // 调用calculateInt方法进行减法计算
        System.out.printf("%d - %d = %d %n", n1, n2,
                f2.calculateInt(n1, n2));
    }

    /**
     * 根据操作符进行计算方法
     *
     * @param opr 操作符
     * @return 实现Calculable接口的运算器对象
     */
    public static Calculable calculate(char opr) {
        Calculable result; // 声明返回值
        // 根据操作符判断
        switch (opr) {
            case '-':
                // Lambda表达式实现Calculable接口
                result = (int a, int b) -> {
                    return a - b;
                };
                break;
            default:
                result = (int a, int b) -> {
                    return a + b;
                };
        }
        return result;
    }
}
