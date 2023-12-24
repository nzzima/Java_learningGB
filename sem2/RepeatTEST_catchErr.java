// 📌 Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

package sem2;

import java.io.FileWriter;
import java.io.IOException;

public class RepeatTEST_catchErr {
    public static void main(String[] args) {
        String inStr = "TEST";
        int countRepeat = 100;

        String str = create_repeatStr(inStr, countRepeat);
        str_to_txtFile(str, "RepeatedTEST.txt");
        // System.out.println(str);
    }

    private static String create_repeatStr(String inStr, int count) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < count; i++) {
            str.append(inStr);
        }
        return str.toString();
    }

    public static void str_to_txtFile(String str, String name_of_file) {
        try (FileWriter filewriter = new FileWriter(name_of_file)) {
            filewriter.write(str);
            System.out.println("Success write!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
