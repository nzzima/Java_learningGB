package lections;

import java.io.FileReader;

public class read_from_file_by_char {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("lections/file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        fr.close();
    }
}
