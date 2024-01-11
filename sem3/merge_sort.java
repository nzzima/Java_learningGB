import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] array = {5, 1, 6, 2, 3, 4};
        int[] result = MergeSort(array);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] MergeSort(int[] array) {
        int[] buffer1 = Arrays.copyOf(array, array.length);
        int[] buffer2 = new int[array.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) return buffer1;

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
