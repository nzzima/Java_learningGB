package Attectation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainNoteBook {
    public static void main(String[] args) {
        NoteBook nb1 = new NoteBook("ASUS", 234, 20, "16GB", "2TB", "Windows10");
        NoteBook nb2 = new NoteBook("ASUS", 456, 22, "8GB", "1TB", "Windows8");
        NoteBook nb3 = new NoteBook("GIGABYTE", 987, 21, "32GB", "4TB", "Windows11");
        NoteBook nb4 = new NoteBook("GIGABYTE", 654, 23, "32GB", "3TB", "Windows10");
        NoteBook nb5 = new NoteBook("MSI", 2135, 32, "64GB", "6TB", "Windows11");
        NoteBook nb6 = new NoteBook("MSI", 3334, 40, "16GB", "3TB", "Windows8");

        Set<NoteBook> notebooks = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6));

        for (NoteBook nb : notebooks) {
            System.out.println(nb);
        }
        System.out.println();
        UserRequest();
    }

    public static void UserRequest() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Choose filter:\n1 -> RAM\n2 -> HD_space\n3 -> OS\n4 -> Serial number");
            System.out.print("Write number of filter: ");
            String request = sc.nextLine();
        }
    }
}
