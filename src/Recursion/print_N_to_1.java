package Recursion;

public class print_N_to_1 {
    static void p(int n){
        if(n==0) return;
        System.out.print(n+ "");
        p(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        p(5);
    }
}
