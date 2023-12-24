// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package sem1;

public class CountNumbers {
    private static int getMaxOnce(int[] numbers) {

        int max = 0;
        int temp = 0;
        for (int num : numbers) {
            if (num == 1) {
                temp++;
//            if (max < temp) max = temp;
//            max = max < temp? temp: max;
                max = Math.max(max, temp);
            } else {
                temp = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 0, 1, 1, 1};
        int max = getMaxOnce(numbers);
        System.out.println(max);
    }
}
