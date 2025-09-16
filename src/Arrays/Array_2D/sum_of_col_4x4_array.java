package Arrays.Array_2D;

public class sum_of_col_4x4_array {
    public static void main(String[] args){

        int[][] matrix= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        for(int j = 0;j<matrix[0].length;j++){ //arr[0] accesses columns and arr accesses rows
            int sum = 0;
            for(int i = 0;i<matrix.length;i++){
                sum += matrix[i][j];
            }
            System.out.println("Sum of column "+j+": "+sum);
        }
    }
}
