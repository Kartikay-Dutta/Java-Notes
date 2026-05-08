package Trees;

public class ancestor {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    boolean ancestors(Node root, int target) {

        if (root == null) return false;

        if (root.data == target) return true;

        if (ancestors(root.left, target) || ancestors(root.right, target)) {
            System.out.print(root.data + " ");
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        ancestor tree = new ancestor();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target = 5;

        tree.ancestors(root, target);
    }
}
