package sem4;

// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class stack_methods {
    static int[] array;
    static int capacity;
    static int top_index;

    public static void main(String[] args) {
        capacity = 5;
        array = new int[capacity];
        top_index = -1;
        
        System.out.println(size());
        push(2);
        push(9);
        System.out.println(size());
        System.out.println(peek());
        push(4);
        System.out.println(size());
        pop();
        System.out.println(size());
    }
    public static int size() {
        return top_index + 1;
    }

    public static boolean empty() {
        return top_index == -1;
    }

    public static void push(int elem) {
        array[++top_index] = elem;
    }

    public static int peek() {
        return array[top_index];
    }

    public static int pop() {
        return array[top_index--];
    }
}
