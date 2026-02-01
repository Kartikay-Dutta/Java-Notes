package Recursion;

public class count_zeroes {
    static int cz(int n){
        if(n==0) return 0;
        if(n%10 == 0){
            return 1 + cz(n/10);
        }
        return cz(n/10);
    }

    public static void main(String[] args) {
        int n = 100000;
        System.out.println(cz(n));
    }
}
