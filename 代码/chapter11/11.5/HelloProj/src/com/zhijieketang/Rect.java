/*
 *   11.5 构造方法 示例
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

    public Rect(double w, double height) {
        this.width = w;
        // this.可以省略
        //width = w;
        this.height = height;

    }

    // 计算面积
    public double getArea() {
        // 返回面积
        return width * height;
    }
}
