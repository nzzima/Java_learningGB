import java.util.ArrayList;
import java.util.LinkedList;

// 📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

public class compare_lists {
    public static void main(String[] args) {
        int count = 100_000;

        System.out.println("Enterring elems at last");
        long start = System.currentTimeMillis();
        addElemArrayListLast(count);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        addElemLinkedListLast(count);
        System.out.println("LinedList: " + (System.currentTimeMillis() - start));

        System.out.println("---------------------------------------------------");
        System.out.println("Enterring elems at first");
        start = System.currentTimeMillis();
        addElemArrayListFirst(count);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        addElemLinkedListFirst(count);
        System.out.println("LinedList: " + (System.currentTimeMillis() - start));

        System.out.println("---------------------------------------------------");
        System.out.println("Enterring elems at middle");
        start = System.currentTimeMillis();
        addElemArrayListMiddle(count);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        addElemLinkedListMiddle(count);
        System.out.println("LinedList: " + (System.currentTimeMillis() - start));
    }

    public static ArrayList<Integer> addElemArrayListLast(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> addElemLinkedListLast(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addLast(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> addElemArrayListFirst(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addFirst(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> addElemLinkedListFirst(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addFirst(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> addElemArrayListMiddle(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> addElemLinkedListMiddle(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        return linkedList;
    }
}
