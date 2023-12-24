// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// 📌 Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

package sem1;

public class Move_to_end {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,3,3,5,6,7,8,9,65,4,3,2,4,65,76,7};
        int value = 7;
        int rigthIndex = numbers.length - 1;

        while(numbers[rigthIndex] == value) {
            rigthIndex--;
        }

        for (int left = 0; left < rigthIndex; left++) {
            if (numbers[left] == value) {
                int temp = numbers[left];
                numbers[left] = numbers[rigthIndex];
                numbers[rigthIndex] = temp;
                rigthIndex--;
            }
        }
        for (int elem : numbers) {
            System.out.print(elem + " ");
        }
    }
}
