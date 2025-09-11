package Patterns;

public class right_angle_inverted_triangle {
    public static void main(String[] args) {

        int n = 5; // height of triangle

        for (int i = n; i >= 1; i--) { // row loop
            for (int j = 1; j <= i; j++) { // column loop
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
    }
}
