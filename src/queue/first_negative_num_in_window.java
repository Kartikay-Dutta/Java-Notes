package queue;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
public class first_negative_num_in_window {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,15,30,16,28};
        int k = 3;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0;i<arr.length;i++){

            while(!dq.isEmpty() && dq.peekFirst() <=i-k ){
                dq.removeFirst();
            }
            if(arr[i] < 0){
                dq.addLast(i);
            }
            if(i >=k-1){
                if(!dq.isEmpty()){
                System.out.print(arr[dq.peekFirst()] + " ");
                }
            }
        }
    }
}
