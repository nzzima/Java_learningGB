// 📌 Заполнить список десятью случайными числами.
// 📌 Отсортировать список методом sort() и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class random_sort {
    public static void main(String[] args) {
        List<Integer> list = createList(10, 100);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static List<Integer> createList(int size, int maxInt) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(maxInt));
        }

        return list;
    }
}
