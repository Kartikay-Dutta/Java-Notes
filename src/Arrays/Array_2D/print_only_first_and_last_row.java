package Arrays.Array_2D;

public class print_only_first_and_last_row {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for(int i = 0; i < matrix.length; i++){
            if(i == 0 || i == matrix.length - 1){   // first or last row
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
