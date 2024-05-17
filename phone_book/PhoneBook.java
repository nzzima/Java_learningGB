import java.util.*;

public class PhoneBook {
    static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    /**
     * Функция, представляющая входную структуру и вывод телефонной книги по убыванию
     * количества номеров телефона.
     * @param args
     */
    public static void main(String[] args) {
        add("George", 12345);
        add("George", 12545);
        add("George", 12945);
        add("Haley", 87654);
        add("Haley", 875484);
        add("Haley", 874324);
        add("Haley", 875114);
        add("Alex", 76548);
        add("Alex", 7866548);
        output_phoneBook(phoneBook);
    }

    /**
     * Функция, добавляющая человека в телефонную книгу
     * @param name Имя человека
     * @param phone_number Номер телефона человека
     */
    public static void add(String name, Integer phone_number) {
        if (phoneBook.isEmpty() || phoneBook.get(name) == null) {
            ArrayList<Integer> newPhone = new ArrayList<>();
            newPhone.add(phone_number);
            phoneBook.put(name, newPhone);
        } else if (phoneBook.containsKey(name)) {
            ArrayList<Integer> phones = phoneBook.get(name);
            phones.add(phone_number);
            phoneBook.put(name, phones);
        }
    }

    /**
     * Функция, осуществляющая верный вывод телефонной книги
     * @param phoneBook Телефонная книга
     */
    public static void output_phoneBook(HashMap<String, ArrayList<Integer>> phoneBook) {
        int maxCountOfPhones = maxCount_of_phone_numbers(phoneBook);
        while (maxCountOfPhones != -1) {
            for (String name : phoneBook.keySet()) {
                ArrayList<Integer> phones = phoneBook.get(name);
                if(phones.size() == maxCountOfPhones) {
                    System.out.print("Name: [" + name + "] Phones: ");
                    System.out.println(phones);
                }
            }
            maxCountOfPhones -= 1;
        }
    }

    /**
     * Функция, считающая максимальное число телефонов у одного человека из всей телефонной книги
     * @param phoneBook Телефонная книга
     * @return Максимальное число
     */
    public static int maxCount_of_phone_numbers(HashMap<String, ArrayList<Integer>> phoneBook) {
        int maxCountOfPhones = 0;
        for (String name : phoneBook.keySet()) {
            ArrayList<Integer> phones = phoneBook.get(name);
            if (phones.size() > maxCountOfPhones)
                maxCountOfPhones = phones.size();
        }
        return maxCountOfPhones;
    }
}
