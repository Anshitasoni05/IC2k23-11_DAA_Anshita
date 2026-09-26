public class RecursiveBubbleSort {

    static void bubbleSort(int[] arr, int n) {

        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        bubbleSort(arr, arr.length);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
