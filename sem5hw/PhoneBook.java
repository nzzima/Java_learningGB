package sem5hw;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(getPhoneBook());
        add("Nick", 12345);
        add("Kate", 12365);
        add("Bruno", 92345);
        System.out.println(getPhoneBook());
        add("Bruno", 9232345);
        System.out.println(getPhoneBook());
        ArrayList<Integer> founded1 = find("Bruno");
        System.out.println(founded1);
        ArrayList<Integer> founded2 = find("Lacy");
        System.out.println(founded2);
        System.out.println(getPhoneBook());
    }

    public static void add(String name, Integer phoneNum) {
        if (phoneBook.isEmpty() || phoneBook.get(name) == null) {
            ArrayList<Integer> newPhone = new ArrayList<>();
            newPhone.add(phoneNum);
            phoneBook.put(name, newPhone);
        } else if (phoneBook.containsKey(name)) {
            ArrayList<Integer> phones = phoneBook.get(name);
            phones.add(phoneNum);
            phoneBook.put(name, phones);
        }
    }

    public static ArrayList<Integer> find(String name) {
        ArrayList<Integer> empty = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            return empty;
        }
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
