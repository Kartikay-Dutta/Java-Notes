package Recursion;

public class count_digits {
    static int cd(int n){
        if(n==0) return 1;
        if(n<10) return 1;
        return 1 + cd(n/10);
    }

    public static void main(String[] args) {
        int n =  1234;
        System.out.println(cd(n));
    }
}
