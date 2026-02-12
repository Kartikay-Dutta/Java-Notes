package Binary.bit_maksing_ques;
import java.util.Scanner;
public class Count_set_bits {
    static int cob(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;}
            n = n >> 1;   // right shift
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cob(n));
    }
}
