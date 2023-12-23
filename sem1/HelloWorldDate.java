// 📌 Настроить проект, вывести в консоль “Hello world!”.
// 📌 Вывести в консоль системные дату и время

package sem1;

import java.time.LocalDateTime;

public class HelloWorldDate {
    public static void main(String[] args) {
        System.out.println("Hello " + "world" + "!");
        System.out.println(LocalDateTime.now()); //Date, Calendar - old versions

        for (String string : args) {
            
        }

        for (int i = 0; i < args.length; i++) {
            
        }

        int[] nums = new int[6];
        int[] array = {32, 32, 56, 78};
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
