package Binary;

public class binary_combinations {
    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < (1 << n); i++) {

            for (int j = 0; j < n; j++) {

                int bit = (i >> j) & 1;
                System.out.print(bit);
            }

            System.out.println();
        }
    }
}
