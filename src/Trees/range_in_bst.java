package Trees;

public class range_in_bst {
    void range(Node root, int L, int R){
        if(root == null) return;
        if(root.data>L) range(root.left,L,R);
        if(root.data >=L && root.data <=R){
            System.out.print(root.data + " ");
        }
        if(root.data<R) range(root.right,L,R);
    }
}
