package Recursion;

public class product_of_digits {
    static int pd(int n){
        if(n<10) return n;
        return n %10 * pd(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(pd(n));
    }
}
