package queue;

import java.util.Stack;

public class next_greater_circ_arr {
    public static void main(String[] args) {
        int[] arr = {1,3,1};
        int n = arr.length;

        int[] res = new int[n];
//        Arrays.fill(res,-1);

        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<2*n;i++){
            int idx = i % n;
            while(!st.isEmpty() && arr[st.peek()] < arr[idx]){
                res[st.pop()] = arr[idx];
            }
            if(i<n) st.push(idx);
        }
//        System.out.println(Arrays.toString(res));
    }
}
