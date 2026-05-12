package Trees;

public class search_in_bst {
    static class Node {
        int data;
        search_in_bst.Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key) return true;
        else if(key<root.data) return search(root.left,key);
        else return search(root.right,key);
    }
        public static void main(String[] args) {

        }
}}
