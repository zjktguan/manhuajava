// HelloWorld.java

/*
11.8 静态代码块 示例
 */


public class HelloWorld {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(Account.interestRate); // 访问类变量
        account.owner = "张三"; // 访问实例变量
        account.amount = 10000d;
    }
}
