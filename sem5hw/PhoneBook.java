package sem5hw;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        add("Nick", 12345);
        add("Kate", 12365);
        add("Bruno", 92345);
        System.out.println(phoneBook);
        add("Bruno", 9232345);
        System.out.println(phoneBook);
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

    // public ArrayList<Integer> find(String name) {

    // }

    // public static HashMap<String, ArrayList<Integer>> getPhoneBook() {


    // }

}
