package Trees;

public class maxSum {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    int maxsum = Integer.MIN_VALUE;

    int maxPath(Node root) {
        if (root == null) return 0;

        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));

        maxsum = Math.max(maxsum, left + right + root.data);

        return root.data + Math.max(left, right);
    }

    public static void main(String[] args) {

        maxSum tree = new maxSum();

        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        tree.maxPath(root);

        System.out.println(tree.maxsum);
    }
}