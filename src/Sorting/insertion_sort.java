package Sorting;

public class insertion_sort{
    public static void main(String[] args) {
        int[] arr = {5, 10, 6, 30, 20};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;  // insert key in correct position
        }

        // print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
