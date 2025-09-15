package Arrays;

import java.util.Arrays; // Needed for Arrays.toString()

public class medium {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6}; // size 5, last space free
        int n = 5;  // Current number of elements
        int value = 10;
        int pos = 2;

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }

        arr[pos] = value; // Insert value
        n++;

        System.out.println(Arrays.toString(arr));
    }
}