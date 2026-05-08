package Trees;
public class mirror_tree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    Node mirror(Node root) {
        if (root == null) return null;
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;

        return root;
    }
}