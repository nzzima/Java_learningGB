package sem5_pre;

import java.util.TreeMap;

public class RimArabNumbers {
    static TreeMap<Integer, String> map = new TreeMap<>();
    public static void main(String[] args) {
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        String text = "MMXXII";
        System.out.println(text + " = " + ConvertFromRoman_to_Arab(text));
        int number = 2025;
        System.out.println(number + " = " + ConvertFromArab_to_Roman(number)); 
    }

    public static int ConvertFromRoman_to_Arab(String roman) {
        int arab = 0;
        for (char s : roman.toCharArray()) {
            for (Integer number : map.keySet()) {
                if (s == map.get(number).charAt(0)) {
                    arab += number;
                }
            }
        }
        return arab;
    }

    public static String ConvertFromArab_to_Roman(int arab) {
        int l = map.floorKey(arab);
        if (arab == l) {
            return map.get(arab);
        }
        return map.get(l) + ConvertFromArab_to_Roman(arab - l);
    }
}
