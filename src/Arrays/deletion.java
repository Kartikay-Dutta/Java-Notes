package Arrays;

import java.util.Arrays; // Needed for Arrays.toString()

public class deletion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0}; // size 5, last space free
        int n = 4;  // Current number of elements
        int pos = 2; // positon to delete

        for (int i = pos; i <n-1; i++) {
            arr[i] = arr[i + 1]; // Shift elements to the left
        }
        n--;

        System.out.println(Arrays.toString(arr));
    }
}

