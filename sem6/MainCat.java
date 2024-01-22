package sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
// Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
// Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
// должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
// Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("черный", 2, "Шипа");
        Cat cat2 = new Cat("белый", 5, "Джеся");
        Cat cat3 = new Cat("серый", 1, "Барсик");
        Cat cat4 = new Cat("черный", 2, "Шипа");
        Cat cat5 = new Cat("белый", 5, "Мурзик");
        Cat cat6 = new Cat("серый", 1, "Барсик");
        Cat cat7 = new Cat("желтый", 3, "Васька");

        Set<Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

}
