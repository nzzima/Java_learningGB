package lections;

import java.io.BufferedReader;
import java.io.FileReader;

public class read_from_file_by_str {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("lections/file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
