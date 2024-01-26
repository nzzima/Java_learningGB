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
        parameters.put(5, "Stop");

        HashMap<Integer, String> RAM_values = new HashMap<>();
        RAM_values.put(1, "8GB");
        RAM_values.put(2, "16GB");
        RAM_values.put(3, "32GB");
        RAM_values.put(4, "64GB");

        HashMap<Integer, String> Storage_values = new HashMap<>();
        Storage_values.put(1, "1TB");
        Storage_values.put(2, "2TB");
        Storage_values.put(3, "3TB");
        Storage_values.put(4, "4TB");
        Storage_values.put(5, "5TB");
        Storage_values.put(6, "6TB");

        HashMap<Integer, String> OS_values = new HashMap<>();
        OS_values.put(1, "Windows");
        OS_values.put(2, "Linux");

        HashMap<Integer, Integer> Serial_values = new HashMap<>();
        Serial_values.put(1, 20);
        Serial_values.put(2, 21);
        Serial_values.put(3, 22);
        Serial_values.put(4, 23);
        Serial_values.put(5, 32);
        Serial_values.put(6, 40);

        label:
        while(true) {
            System.out.println("Choose filter:\n1 -> RAM\n2 -> HD_space\n3 -> OS\n4 -> Serial number\n5 -> Stop programm");
            System.out.print("Enter filter: ");

            String filter_request = sc.nextLine();
            int fil_req = Integer.parseInt(filter_request);

            switch (filter_request) {
                case "5":
                    break label;
                case "1": {
                    System.out.println("Choose value:\n1 -> 8 GB\n2 -> 16 GB\n3 -> 32 GB\n4 -> 64 GB");
                    System.out.print("Enter value: ");
                    int value_request = Integer.parseInt(sc.nextLine());
                    System.out.println("------------------------------------OUTPUT------------------------------------");
                    for (NoteBook nb : notebooks) {
                        if (nb.getRAM().equals(RAM_values.get(value_request))) {
                            System.out.println(nb);
                        } else continue;
                    }
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                }
                case "2": {
                    System.out.println("Choose value:\n1 -> 1 TB\n2 -> 2 TB\n3 -> 3 TB\n4 -> 4 TB\n5 -> 5 TB\n6 -> 6 TB");
                    System.out.print("Enter value: ");
                    int value_request = Integer.parseInt(sc.nextLine());
                    System.out.println("------------------------------------OUTPUT------------------------------------");
                    for (NoteBook nb : notebooks) {
                        if (nb.getHdSpace().equals(Storage_values.get(value_request))) {
                            System.out.println(nb);
                        } else continue;
                    }
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                }
                case "3": {
                    System.out.println("Choose value:\n1 -> Windows\n2 -> Linux");
                    System.out.print("Enter value: ");
                    int value_request = Integer.parseInt(sc.nextLine());
                    System.out.println("------------------------------------OUTPUT------------------------------------");
                    for (NoteBook nb : notebooks) {
                        if (nb.getOS().equals(OS_values.get(value_request))) {
                            System.out.println(nb);
                        } else continue;
                    }
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                }
                case "4": {
                    System.out.println("Choose value:\n1 -> 20\n2 -> 21\n3 -> 22\n4 -> 23\n5 -> 32\n6 -> 40");
                    System.out.print("Enter value: ");
                    int value_request = Integer.parseInt(sc.nextLine());
                    System.out.println("------------------------------------OUTPUT------------------------------------");
                    for (NoteBook nb : notebooks) {
                        if (nb.getSerial() == Serial_values.get(value_request)) {
                            System.out.println(nb);
                        } else continue;
                    }
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                }
            }


            //sc.close();
        }
    }


}