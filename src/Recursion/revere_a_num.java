package Recursion;

public class revere_a_num {
    static int revNum(int n, int rev){
        if(n==0) return rev;
        return revNum(n/10, rev*10 +(n%10));
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(revNum(n,0));
    }
}
