/*
 *  11.5.1 默认构造方法 示例
 */

// Rect.java
package com.zhijieketang;

public class Rect {

    // 矩形宽度
    double width;
    // 矩形高度
    double height;
    // 矩形面积
    double area;

    public Rect() {

    }

    // 计算面积
    public double getArea() {
        // 返回面积
        return width * height;
    }
}
