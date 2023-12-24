// 📌 Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// 📌 Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

package sem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class foldersTree {
    public static void main(String[] args) {
        String[] contentFolder = getContentFolder(".");
        //String[] contentFolder = getContentFolder(System.getProperty("user.dir"));
        write_to_File(contentFolder, "Folder.txt");
    }

    public static String[] getContentFolder (String folderName) {
        File folder = new File(folderName);
        return folder.list();
    }

    public static void write_to_File (String[] str, String name_of_file) {
        try (FileWriter fw = new FileWriter(name_of_file)) {
            
            for (String element : str) {
                fw.write(element);
                fw.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
