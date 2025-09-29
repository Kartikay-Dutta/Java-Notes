package Patterns;

public class palindrome {
    public static void main(String[] args){


                int[] arr = {10, 20, 30, 40, 50};
                int n = arr.length;
                int pos = 2; // index to delete (0-based)

                // shift left
                for (int i = pos; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
//                arr[n - 1] = 0; // optional, set last as 0

                // print array
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }



