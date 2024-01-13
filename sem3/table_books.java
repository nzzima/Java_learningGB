// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class table_books {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        create_catalog(catalog);
    }

    public static void create_catalog(List<ArrayList<String>> catalog) {
        ArrayList<String> genrel1 = new ArrayList<>(Arrays.asList("Detective", "Book1", "Book2", "Book3"));
        ArrayList<String> genrel2 = new ArrayList<>(Arrays.asList("Prose", "Book1", "Book2", "Book3"));
        ArrayList<String> genrel3 = new ArrayList<>(Arrays.asList("Love story", "Book1", "Book2", "Book3"));

        catalog.add(genrel1);
        catalog.add(genrel2);
        catalog.add(genrel3);

        for (ArrayList<String> genrel : catalog) {
            System.out.println(genrel);
        }
    }
}
