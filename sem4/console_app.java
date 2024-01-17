import java.util.LinkedList;
import java.util.Scanner;

public class console_app {
    public static void main(String[] args) {
        takeStringFromUser();
    }

    public static void takeStringFromUser() {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter string like text~num for adding elems to list");
            System.out.println("Enter string like print~num to print and delete elem");
            System.out.println("Enter string like stop to stop programm");

            String request = sc.nextLine();

            if (request.equals("stop")) {
                break;
            }

            String[] parts = request.split("~");

            String text = parts[0];
            int index = Integer.parseInt(parts[1]);

            try {
                if (text.equals("print")) {
                    System.out.println(list.get(index));
                    list.remove(index);
                    System.out.println(list);
                } else {
                    list.add(index, text);
                    System.out.println(list);
                }
            } catch (Exception e) {
                System.out.println("Incorrect index");
                System.out.println(list);
            }
            
        }

        sc.close();
    }
}
