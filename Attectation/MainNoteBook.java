package Attectation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainNoteBook {
    static Set<NoteBook> notebooks;
    public static void main(String[] args) {
        NoteBook nb1 = new NoteBook("ASUS", 234, 20, "16GB", "2TB", "Windows");
        NoteBook nb2 = new NoteBook("ASUS", 456, 22, "8GB", "1TB", "Windows");
        NoteBook nb3 = new NoteBook("GIGABYTE", 987, 21, "32GB", "4TB", "Linux");
        NoteBook nb4 = new NoteBook("GIGABYTE", 654, 23, "32GB", "3TB", "Windows");
        NoteBook nb5 = new NoteBook("MSI", 2135, 32, "64GB", "6TB", "Windows");
        NoteBook nb6 = new NoteBook("MSI", 3334, 40, "16GB", "3TB", "Windows");
        NoteBook nb7 = new NoteBook("GIGABYTE", 654, 23, "32GB", "3TB", "Linux");

        Set<NoteBook> notebooks = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6, nb7));

        // for (NoteBook nb : notebooks) {
        //     System.out.println(nb);
        // }

        System.out.println();
        UserFilterRequest(notebooks);
    }

    public static void UserFilterRequest(Set<NoteBook> notebooks) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> parameters = new HashMap<>();
        parameters.put(1, "RAM");
        parameters.put(2, "HD_space");
        parameters.put(3, "OS");
        parameters.put(4, "Serial number");

        while(true) {
            System.out.println("Choose filter:\n1 -> RAM (8/16/32GB)\n2 -> HD_space (1/2/3/4/6TB)\n3 -> OS (Windows/Linux)\n4 -> Serial number (1,...,40)\n5 -> Stop programm");
            System.out.print("Write number of parameter and value \n(For example, if you enter 1~16GB, you'll see notebooks with RAM = 16 GB): ");
            String request = sc.nextLine();

            String[] parts_of_request = request.split("~");

            if (parts_of_request[0].equals("5")) {
                break;
            }

            if (parts_of_request[0].equals("1")) {
                String param = parameters.get(1);
                Filtering(param, parts_of_request[1], notebooks);
            } else if (parts_of_request[0].equals("2")) {
                String param = parameters.get(2);
                Filtering(param, parts_of_request[1], notebooks);
            } else if (parts_of_request[0].equals("3")) {
                String param = parameters.get(3);
                Filtering(param, parts_of_request[1], notebooks);
            } else if (parts_of_request[0].equals("4")) {
                String param = parameters.get(4);
                Filtering(param, parts_of_request[1], notebooks);
            }

            //sc.close();
        }
    }

    public static void Filtering(String parameter, String filter, Set<NoteBook> notebooks) {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        if (parameter == "RAM") {
            for (NoteBook nb : notebooks) {
                if (nb.getRAM().equals(filter)) {
                    System.out.println(nb);
                } else continue;
            }
            System.out.println("-------------------------------------------------------------------------------------------------------");
        } else if (parameter == "HD_space") {
            for (NoteBook nb : notebooks) {
                if (nb.getHdSpace().equals(filter)) {
                    System.out.println(nb);
                } else continue;
            }
            System.out.println("-------------------------------------------------------------------------------------------------------");
        } else if (parameter == "OS") {
            for (NoteBook nb : notebooks) {
                if (nb.getOS().equals(filter)) {
                    System.out.println(nb);
                } else continue;
            }
            System.out.println("-------------------------------------------------------------------------------------------------------");
        } else if (parameter == "Serial number") {
            int ser = Integer.parseInt(filter);
            for (NoteBook nb : notebooks) {
                if (nb.getSerial() == ser) {
                    System.out.println(nb);
                } else continue;
            }
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }
    }
}