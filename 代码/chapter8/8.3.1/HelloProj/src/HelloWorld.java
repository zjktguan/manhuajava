/*
 * 8.3.1 字符串追加 示例
 */
public class HelloWorld {
    public static void main(String[] args) {

        //创建可变字符串对象
        StringBuilder sbuilder1 = new StringBuilder("Hello");
        //连续多次追加数据
        sbuilder1.append(" ").append("World");
        sbuilder1.append('.');
        System.out.printf("sbuilder1 = %s%n", sbuilder1);

        // 创建可变字符串对象
        StringBuilder sbuilder2 = new StringBuilder();
        Object obj = null;
        //连续多次追加数据
        sbuilder2.append(false).append('\t').append(obj);
        System.out.printf("sbuilder2 = %s%n", sbuilder2);


        // 创建可变字符串对象
        StringBuilder sbuilder3 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sbuilder3.append(i);         //追加整数
        }
        System.out.printf("sbuilder3 = %s%n", sbuilder3);


    }
}
