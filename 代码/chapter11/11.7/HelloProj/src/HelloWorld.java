// HelloWorld.java

/*
11.7 类变量和类方法 示例
 */


public class HelloWorld {
    public static void main(String[] args) {
        Account account = new Account();
        account.owner = "张三"; // 访问实例变量
        account.amount = 10000d;
        System.out.println(Account.interestRate); // 访问类变量
        System.out.println(account.interestBy(2000d)); // 访问实例方法
        System.out.println(Account.getInterestRate()); // 访问类方法
    }
}
