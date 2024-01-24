package Attectation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainNoteBook {
    static Set<NoteBook> notebooks;
    public static void main(String[] args) {
        NoteBook nb1 = new NoteBook("ASUS", 234, 20, "16 GB", "2 TB", "Windows 10");
        NoteBook nb2 = new NoteBook("ASUS", 456, 22, "8 GB", "1 TB", "Windows 8");
        NoteBook nb3 = new NoteBook("GIGABYTE", 987, 21, "32 GB", "4 TB", "Windows 11");
        NoteBook nb4 = new NoteBook("GIGABYTE", 654, 23, "32 GB", "3 TB", "Windows 10");
        NoteBook nb5 = new NoteBook("MSI", 2135, 32, "64 GB", "6 TB", "Windows 11");
        NoteBook nb6 = new NoteBook("MSI", 3334, 40, "16 GB", "3 TB", "Windows 8");

        Set<NoteBook> notebooks = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6));

        for (NoteBook nb : notebooks) {
            System.out.println(nb);
        }
        System.out.println();
        UserFilterRequest();
    }

    public static void UserFilterRequest() {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> filters = new HashMap<>();
        filters.put(1, "RAM");
        filters.put(2, "HD_space");
        filters.put(3, "OS");
        filters.put(4, "Serial number");

        while(true) {
            System.out.println("Choose filter:\n1 -> RAM\n2 -> HD_space\n3 -> OS\n4 -> Serial number\n5 -> Stop programm");
            System.out.print("Write number of filter: ");
            String request = sc.nextLine();

            if (request.equals("5")) {
                break;
            }

            if (request.equals("1")) {
                String[] parts = filters.get(1).split(" ");
                for (NoteBook nb : notebooks) {
                    
                }
            }
        }
    }

    public static void min_filters(String filter) {
        
    }
}
