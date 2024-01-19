package sem5_pre;

import java.util.HashMap;

public class NumbersNameStruct {
    public static void main(String[] args) {
        HashMap<Integer, String> struct = new HashMap<>();
        struct.put(123456, "Ivanov");
        struct.put(321456, "Vasiliev");
        struct.put(234561, "Petrova");
        struct.put(234432, "Ivanov");
        struct.put(654321, "Petrova");
        struct.put(345678, "Ivanov");

        PrintMap(struct, null);
        System.out.println();
        PrintMap(struct, "Ivanov");
    }

    public static void PrintMap(HashMap<Integer, String> struct, String value) {
        for (Integer number : struct.keySet()) {
            String key = number.toString();
            String surname = struct.get(number).toString();
            if (value == null) {
                System.out.println("| " + key + " | " + surname + " |");
            } else {
                if (surname == value) {
                    System.out.println("| " + key + " | " + surname + " |");
                } else continue;
            }
        }
    }
}
