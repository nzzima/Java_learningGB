package lections;

import java.io.FileWriter;

public class create_write_to_file {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("lections/file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.write("line 3");
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
