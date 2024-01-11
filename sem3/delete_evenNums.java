import java.util.ArrayList;

public class delete_evenNums {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> res = removeEvenNums(array);
        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }

    public static ArrayList<Integer> removeEvenNums(Integer[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            } else continue;
        }
        return result;
    }

    public static void Print(ArrayList<Integer> arr) {
        System.out.print("[");
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) System.out.print(arr.get(i));
            else System.out.print(arr.get(i) + ", ");
        }
        System.out.println("]");
    }
}
