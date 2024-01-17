import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

public class console_stack_string {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Enter string to list");
            System.out.println("2. Enter print to share reverse list");
            System.out.println("3. Enter revert to delete last element");
            System.out.println("4. Enter stop  to stop the programm");
            String request = sc.nextLine();
            if (request.equals("stop")) {
                break;
            }
            if (request.equals("print")) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
            } else if (request.equals("revert")) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.add(request);
                System.out.println(list);
            }
        }

        sc.close();
    }
}
