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
import java.time.LocalDateTime;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ContentFolder {
    private static Logger logger = Logger.getLogger(ContentFolder.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] contentFolder = getFolderContent("sem1");
        // String[] contentFolder = getFolderContent(System.getProperty("user.dir"));
        writeToFile(contentFolder, "sem2/Folder.txt");
    }

    public static String[] getFolderContent(String nameFolder) {
        File folder = new File(nameFolder);
        return folder.list();
    }

    public static void writeToFile(String[] str, String nameFile) {
        try (FileWriter fw = new FileWriter(nameFile)) {

            for (String element : str) {
                fw.write(element);
                fw.write(System.lineSeparator());
            }
            writeToLogFile("Информация успешно записана в файл. ", "log.txt");
        } catch (Exception e) {
            // writeToLogFile("Ошибка записи информации! ", "log.txt");
            logger.log(Level.INFO, "Ошибка записи информации!");
            logger.info(e.getMessage());
        }
    }

    public static void writeToLogFile(String msg, String nameLogFile) {
        try (FileWriter fw = new FileWriter(nameLogFile)) {
            fw.write(msg);
            fw.write(LocalDateTime.now().toString());
        } catch (Exception e) {
            System.out.println("Ошибка записи информации");
        }
    }
}