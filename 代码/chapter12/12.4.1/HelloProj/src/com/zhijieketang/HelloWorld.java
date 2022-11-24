//com/zhijieketang/HelloWorld.java
package com.zhijieketang;
/*
   12.4.1 对象类型检查 示例
 */

public class HelloWorld {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        Shape shape2 = new Triangle();
        Shape shape3 = new Ellipse();

        // 创建Shape数组，子类对象放到Shape数组中
        Shape[] shapes = {shape1, shape2, shape3};
        int rectangleCount = 0;
        int triangleCount = 0;
        int ellipseCount = 0;

        for (Shape item : shapes) {
            if (item instanceof Rectangle) {
                rectangleCount++;
            } else if (item instanceof Triangle) {
                triangleCount++;
            } else {
                ellipseCount++;
            }
        }
        System.out.printf("Rectangle数：%d，Triangle数：%d，Ellipse数：%d",
                rectangleCount,
                triangleCount,
                ellipseCount);
    }
}