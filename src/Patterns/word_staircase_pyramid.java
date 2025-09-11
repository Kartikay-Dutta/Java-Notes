package Patterns;

public class word_staircase_pyramid {
    public static void main(String[] args) {
        String[] Str = {"I", "N", "T", "E", "L", "L", "I", "J"};

        for (int i = 0; i < Str.length; i++) {
            for (int j = i; j < Str.length; j++) {
                System.out.print(Str[j]);
            }
            System.out.println();
        }
    }
}
