package Recursion;

public class sum_of_digits {
    static int sd(int n){
        if(n<10) return n;
        return n%10 + sd(n/10);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sd(n));
    }
}
