/*
 * 8.5.3（2） 	字符串比较前缀和后缀示例
 */
public class HelloWorld_2 {
    public static void main(String[] args) {

        // 判断文件夹中文件名
        String[] docFolder = {"java.docx",
                " JavaBean.docx",
                "Objecitve-C.xlsx",
                "Swift.docx "};
        int wordDocCount = 0;
        // 查找文件夹中Word文档个数
        for (String doc : docFolder) {
            // 去的前后空格
            doc = doc.trim();
            // 比较后缀是否有.docx字符串
            if (doc.endsWith(".docx")) {
                wordDocCount++;
            }
        }
        System.out.println("文件夹中Word文档个数是： " + wordDocCount);

        int javaDocCount = 0;
        // 查找文件夹中Java相关文档个数
        for (String doc : docFolder) {
            // 去的前后空格
            doc = doc.trim();
            // 全部字符转成小写
            doc = doc.toUpperCase();
            // 比较前缀是否有java字符串
            if (doc.startsWith("java")) {
                javaDocCount++;
            }
        }
        System.out.println("文件夹中Java相关文档个数是：" + javaDocCount);

    }
}
