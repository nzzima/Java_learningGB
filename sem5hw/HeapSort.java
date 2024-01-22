package sem5hw;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        heapsort(array, array.length);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void heapsort(int[] sortArray, int sortLength) {
        for (int i = sortLength / 2-1; i >= 0; i--) {
            heapify(sortArray, sortLength, i);
        }
        for (int i = sortLength - 1; i >= 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            heapify(sortArray, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2*i + 1; 
        int r = 2*i + 2; 

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}