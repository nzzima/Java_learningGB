package sem2;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BubbleSort {
    public static void main(String[] args) {
        
        int[] arr = {9,4,8,3,1};
        bubble_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bubble_sort(int[] array) {
        try (FileWriter fw = new FileWriter("log.txt")) {
            int temp;
            boolean swapped;
            for (int i = 0; i < array.length; i++) {
                swapped = false;
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Date date_now = new Date();
                fw.append(formater.format(date_now)).append(" ");
                fw.append("[");
                for (int k = 0; k < array.length; k++) {
                    if (k != array.length - 1) 
                        fw.append(String.valueOf(array[k])).append(", ");
                    else fw.append(String.valueOf(array[k]));
                }
                if (i != array.length - 1)
                    fw.append("]").append("\n");
                else fw.append("]");
                if (swapped == false)
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error write information!");
        }
        
    }
}
