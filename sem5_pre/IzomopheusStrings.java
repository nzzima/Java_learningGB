package sem5_pre;

import java.util.HashMap;

public class IzomopheusStrings {
    public static void main(String[] args) {
        System.out.println(isIzomoph("More", "Sory"));
        System.out.println(isIzomoph("Place", "Price"));
        System.out.println(isIzomoph("Matcha", "Morcge"));
    }

    public static boolean isIzomoph(String one, String two) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < one.length(); i++) {
            if (!map.containsKey(one.charAt(i))) {
                if(map.containsKey(two.charAt(i))) {
                    return false;
                } else {
                    map.put(one.charAt(i), two.charAt(i));
                }
            } else {
                if (map.get(one.charAt(i)) != two.charAt(i)) {
                    return false;
                }
            }
        }
        System.out.println(map);
        return true;
    }
}
