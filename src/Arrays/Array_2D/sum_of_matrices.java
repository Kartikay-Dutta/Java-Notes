package Arrays.Array_2D;

public class sum_of_matrices {
public static void main(String[] args){
            // Example: 2x3 matrices
            int rows = 3, cols = 3;

            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {67,41,42}
            };

            int[][] matrix2 = {
                    {7, 8, 9},
                    {10, 11, 12},
                    {13,14,16}
            };

            // Result matrix to store the sum
            int[][] sum = new int[rows][cols];

            // Adding corresponding elements
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Display the result
            System.out.println("Sum of the two matrices:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
