package Trees;

public class search_in_tree {
    boolean find(Node root, int key){
        if(root==null) return false;
        if(root.data==key) return true;
        return find(root.left,key) || find(root.right,key);
    }
}
