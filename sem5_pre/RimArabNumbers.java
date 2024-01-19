package sem5_pre;

import java.util.HashMap;

public class RimArabNumbers {
    public static void main(String[] args) {
        HashMap<Integer, Character> struct = new HashMap<>();
        struct.put(1, 'I');
        struct.put(5, 'V');
        struct.put(10, 'X');
        struct.put(50, 'L');
        struct.put(100, 'C');
        struct.put(500, 'D');
        struct.put(1000, 'M');

        String text = "MMXXII";
        int arab = ConvertFromRim_to_Arab(struct, text);
        System.out.println(text + " = " + arab);
    }

    public static int ConvertFromRim_to_Arab(HashMap<Integer, Character> struct, String rim) {
        int arab_number = 0;
        for (char c : rim.toCharArray()) {
            for (Integer number : struct.keySet()) {
                if (c == struct.get(number)) {
                    arab_number += number;
                }
            }
        }
        return arab_number;
    }
}
