package Trees;

public class max_element {
    int findMax(Node root){
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(findMax(root.left),findMax(root.right));
    }
}
