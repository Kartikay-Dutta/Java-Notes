package Arrays.Array_2D;

public class product_of_diagonals {
    public static void main(String[] args){
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int prod = 1;
        for(int i = 0;i<matrix.length;i++){
            int[] row = matrix[i];

            for(int j = 0;j<row.length;j++) {

                if (matrix[i] == matrix[j]) {
                    prod = prod * matrix[i][j];
                }

            }

        }
        System.out.println(prod);

    }
}
