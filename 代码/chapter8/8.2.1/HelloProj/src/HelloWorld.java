/*
 * 8.2.1  字符串拼接示例
 */
public class HelloWorld {
    public static void main(String[] args) {
        String s1 = "Hello";
        // 使用+运算符连接
        String s2 = s1 + "World";
        System.out.printf("s1= %s%n", s2);
        String s3 = "Hello";
        s3 += " World";
        System.out.printf("s3= %s%n", s3);

        String s4 = "Hello";
        // 使用concat方法连接
        s4 = s4.concat(" ").concat("World");
        System.out.printf("s4= %s%n", s4);

        int age = 18;
        String s5 = "她的年龄是" + age + "岁。";
        System.out.printf("s5= %s%n", s5);

        java.util.Date now = new java.util.Date();
        //对象拼接自动调用toString方法
        String s6 = "今天是：" + now;
        System.out.printf("s6= %s%n", s6);

    }
}
