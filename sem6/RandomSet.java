package sem6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 500
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

public class RandomSet {
    public static void main(String[] args) {
        int[] array = GetRandomArray(1000, 500);
        System.out.println(GetPercentUnic(array));
    }

    public static int[] GetRandomArray(int length, int max) {
        int[] data = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            data[i] = rand.nextInt(max);
        }
        return data;
    }

    public static double GetPercentUnic(int[] data) {
        Set<Integer> hashSet = new HashSet<>();
        for (int element : data) {
            hashSet.add(element);
        }
        double percent = (double) hashSet.size() * 100 / data.length;
        return percent;
    }
}
