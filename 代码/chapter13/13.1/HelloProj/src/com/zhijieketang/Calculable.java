//com/zhijieketang/Calculable.java
package com.zhijieketang;

/*
 *   13.1 函数式接口 示例
 */
@FunctionalInterface
interface Calculable {
    // 计算两个int数值

    /**
     * 实现两个整数的运算
     *
     * @param a 操作数1
     * @param b 操作数2
     * @return 运行结果
     */
    int calculateInt(int a, int b);
}

