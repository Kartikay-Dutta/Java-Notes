package Recursion;

public class binary_string_till_n {
    static void bs(String current,int n){
        if(n==0){
            System.out.println(current);
            return;
        }
        bs(current + "0", n-1);
        bs(current + "1", n-1);
    }

    public static void main(String[] args) {
        int n = 3;
        bs("", n);
    }
}
