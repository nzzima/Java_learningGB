// 📌 Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

package sem1;

import java.util.Scanner;

public class UserName_request {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in, "ibm866"); //encoding <ibm866> for russian language
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.printf("Hello, %s!", name);
        scanner.close();
    }
}
