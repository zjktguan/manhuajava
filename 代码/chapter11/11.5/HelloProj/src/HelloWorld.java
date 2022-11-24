
/*
  11.5 构造方法 示例
 */
// HelloWorld.java

import com.zhijieketang.Rect;

public class HelloWorld {
    public static void main(String[] args) {
        Rect rec = new Rect(200.00, 300.00);

        System.out.printf("%.2f×%.2f = %.2f",
                200.0,
                300.0,
                rec.getArea());
    }
}