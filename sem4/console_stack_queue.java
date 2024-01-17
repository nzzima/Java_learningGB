import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

public class console_stack_queue {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 9, 12, 16, 19, 0, -1};
        Stack<Integer> st = getArray_to_Stack(array);
        while(!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
        Queue<Integer> qu = getArray_to_Queue(array);
        System.out.println(qu);
    }

    public static Stack<Integer> getArray_to_Stack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int elem : array) {
            stack.push(elem);
        }
        return stack;
    }

    public static Queue<Integer> getArray_to_Queue(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (int elem : array) {
            queue.add(elem);
        }
        return queue;
    }
}
