/*
 * 8.2.2 字符串查找
 */
public class HelloWorld {

    public static void main(String[] args) {
        String s = "Hello!";
        // 获得字符串长度
        int len = s.length(); // 返回6
        // 获得索引位置1的字符
        char ch = s.charAt(1); // 返回字符e
        // 从左往右查找字符l
        int pos = s.indexOf('l');// 返回2
        // 从右往左查找字符
        pos = s.lastIndexOf('l'); // 返回3
        pos = s.indexOf("lo");// 返回3
        pos = s.lastIndexOf("lo");// 返回3
        pos = s.indexOf('l', 4);// 返回-1
    }
}
