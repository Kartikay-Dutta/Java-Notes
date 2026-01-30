package Recursion;
// Time complexity = O(2^n)
public class coin_toss {
    static void coinToss(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        coinToss(n-1, ans+"H");
        coinToss(n-1, ans + "T");


    }

    public static void main(String[] args) {
        coinToss(2, "");
    }
}
