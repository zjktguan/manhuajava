import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        // 计算获得BMI指数
        float bmi = 28.10f; // 换成自己计算的BMI指数

        try (
                FileOutputStream fos = new FileOutputStream("Data.csv", true);
                PrintWriter printWriter = new PrintWriter(fos)) {


            StringBuilder line = new StringBuilder();
            line.append(df.format(date)).append(',')
                    .append(bmi);

            printWriter.println(line);

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}