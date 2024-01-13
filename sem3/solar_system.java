// 📌 Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.

// Задание состоит из двух блоков

// Задание №2.2 (если выполнено первое задание)
// 📌 Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class solar_system {
    public static void main(String[] args) {
        List<String> planets = getPlanets(15);
        System.out.println(planets);
        count_ofRepeatedPlanets(planets);
        delete_RepeatedPlanets(planets);
        System.out.println(planets);
    }

    private static List<String> getPlanets(int size) {
        String[] plans = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Pluto"};
        List<String> planets = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            Random number = new Random();
            planets.add(plans[number.nextInt(plans.length)]);
        }
        return planets;
    }

    public static void count_ofRepeatedPlanets(List<String> planets) {
        List<String> newPlanets = new ArrayList<>(planets);
        Collections.sort(newPlanets);
        int count = 0;
        String temp = newPlanets.get(0);
        for (int i = 0; i < newPlanets.size(); i++) {
            if (newPlanets.get(i).equals(temp)) {
                count++;
            } else {
                System.out.println(temp + " " + count);
                count = 1;
                temp = newPlanets.get(i);
            }
        }
        System.out.println(temp + " " + count);
    }

    public static void delete_RepeatedPlanets(List<String> planets) {
        for (int i = 0; i < planets.size(); i++) {
            String temp = planets.get(i);
            for (int j = planets.size() - 1; j > i; j--) {
                if (planets.get(j).equals(temp)) {
                    planets.remove(j);
                } else continue;
            }
        }
    }
}