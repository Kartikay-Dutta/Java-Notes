package Arrays.Array_2D;

public class enhanced_for_loop {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for(int[] row: matrix){
            for(int num:row){
                System.out.print(num+ " ");
            }
            System.out.println();
        }

    }
}
