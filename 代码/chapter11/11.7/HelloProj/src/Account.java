// Account.java

/*
11.7 类变量和类方法 示例
 */


public class Account {

    // 实例变量【账户金额】
    double amount = 0.0d;
    // 实例变量【账户名】
    String owner;
    // 类变量【利率】
    static double interestRate = 0.0668d;

    // 实例方法
    public double interestBy(double amt) {
        return interestRate * amt; // 计算并返回利息
    }

    // 类方法
    public static double getInterestRate() {
        return interestRate;
    }
}