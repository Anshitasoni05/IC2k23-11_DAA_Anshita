public class RecursiveInsertionsort {

    static void insertionSort(int[] arr, int n) {

        if (n <= 1)
            return;

        insertionSort(arr, n - 1);

        int key = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        insertionSort(arr, arr.length);

        for (int x : arr)
            System.out.print(x + " ");
    }
}