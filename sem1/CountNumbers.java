// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package sem1;

public class CountNumbers {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1,0,0,1,1,1,1,0,1,0,1,1,0};
        int count = 0;
        int max = 0;
        for (int elem : array) {
            if (elem == 1) {
                count = count + 1;

                //if (max < count) max = count;
                //max = max < count? count: max;
                max = Math.max(max, count);
            }
            else max = 0;
        }
        System.out.println(max);
    }
}
