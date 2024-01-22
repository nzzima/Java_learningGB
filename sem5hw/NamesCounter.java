package sem5hw;

import java.util.HashMap;

public class NamesCounter {
    private static HashMap<String, Integer> names = new HashMap<>();
    public static void main(String[] args) {
        addName("Elena");
        addName("Elena");
        addName("Elena");
        addName("Ivan");
        addName("Ivan");
        showNamesOccurrences();
    }

    public static void addName(String name) {
        if (names.containsKey(name)) {
            int count = names.get(name);
            count += 1;
            names.put(name, count);
        } else {
            names.put(name, 1);
        }
    }

    public static void showNamesOccurrences() {
        System.out.println(names);
    }
}
