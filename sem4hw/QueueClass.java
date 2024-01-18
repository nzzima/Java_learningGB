package sem4hw;

import java.util.LinkedList;

public class QueueClass {
    static LinkedList<Integer> queue;
    public static void main(String[] args) {
        queue = new LinkedList<>();
        enqueu(1);
        enqueu(2);
        enqueu(20);
        enqueu(11);
        enqueu(11);
        System.out.println(queue);
        dequeue();
        System.out.println(queue);
        int c = first();
        System.out.println(c);
        LinkedList<Integer> data = getElements();
        System.out.println(data);
    }

    public static void enqueu(int element) {
         queue.add(element);
    }

    public static void dequeue() {
        queue.remove(queue.element());
    }

    public static int first() {
        return queue.element();
    }

    public static LinkedList<Integer> getElements() {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer elem : queue) {
            result.add(elem);
        }
        return result;
    }
}
