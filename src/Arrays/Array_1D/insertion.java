package Arrays.Array_1D;

import java.util.Arrays; // Needed for Arrays.toString()

public class insertion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0}; // size 5, last space free
        int n = 4;  // Current number of elements
        int value = 25;
        int pos = 2; // Insert at index 2 (0-based)

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }

        arr[pos] = value; // Insert value
        n++;

        System.out.println(Arrays.toString(arr));
    }
}

