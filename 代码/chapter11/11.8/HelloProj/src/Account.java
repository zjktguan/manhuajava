// Account.java

/*
11.8 静态代码块 示例
 */


public class Account {

    // 实例变量【账户金额】
    double amount = 0.0d;
    // 实例变量【账户名】
    String owner;
    // 声明类变量【利率】
    static double interestRate = 0.0668d;

    // 静态代码块
    static {
        System.out.println("静态代码块被调用...");

        Double random = Math.random();// 产生0.0~1.0 之间的随机数
        interestRate = random * 0.1;// 产生0.1~0.01 之间的随机数
    }


    // 实例方法
    public double interestBy(double amt) {
        return interestRate * amt; // 计算并返回利息
    }

    // 类方法
    public static double getInterestRate() {
        return interestRate;
    }


}