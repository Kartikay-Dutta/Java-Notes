package queue;

import java.util.Stack;


public class largest_in_histogram {
    public static void main(String[] args) {
        int[] h = {2,1,5,6,3};
        int n = h.length;
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i =  0;i<=n;i++){
            int height = (i==n) ? 0: h[i];
            while(!st.isEmpty() && height<h[st.peek()]){
                int ht = h[st.pop()];
                int width = st.isEmpty() ? i : i-st.peek()-1;
                max = Math.max(max,ht*width);
            }
            st.push(i);
        }
        System.out.println(max);
    }
}
