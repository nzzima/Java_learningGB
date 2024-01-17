import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>(Arrays.asList(1,"One",3,"Two",5));
        LinkedList<Object> reverse_list = reverse(list);
        System.out.println(reverse_list);
    }

    public static LinkedList<Object> reverse(LinkedList<Object> list) {
        LinkedList<Object> reverse_list = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverse_list.add(list.get(i));
        }
        return reverse_list;
    }
}
