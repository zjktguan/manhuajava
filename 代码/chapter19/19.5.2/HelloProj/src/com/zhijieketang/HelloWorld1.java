
// zhijieketang/HelloWorld1.java

package com.zhijieketang;

/*
 * 19.5.2 线程同步【使用synchronized锁定方法】 示例
 */
public class HelloWorld1 {
    public static void main(String[] args) {
        // 创建水果篮对象
        Basket basket = new Basket();

        // 创建线程A
        //
        Thread threadA = new Thread(() -> {
            while (true) {
                if (eat(basket)) {
                    break; // 结束线程A
                }
            }
            System.out.println("线程A结束。");
        }, "线程A");
        // 启动线程A
        threadA.start();

        // 创建线程B
        //
        Thread threadB = new Thread(() -> {
            while (true) {
                if (eat(basket)) {
                    break; // 结束线程B
                }
            }
            System.out.println("线程B结束。");
        }, "线程B");
        // 启动线程B
        threadB.start();
    }

    /**
     * 吃苹果方法
     *
     * @param basket 苹果篮对象
     * @return false继续线程 true 结束线程
     */
    public synchronized static boolean eat(Basket basket) {
        if (basket.appleCount > 0) {
            //  获取当前线程名
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 吃到拿苹果了！");
            basket.appleCount--;
            return false; // 继续线程
        } else {
            System.out.println("水果篮空了！");
            return true; // 结束线程
        }
    }
}
