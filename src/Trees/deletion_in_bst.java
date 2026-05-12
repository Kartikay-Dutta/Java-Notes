package Trees;

public class deletion_in_bst {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node delete(Node root, int key) {

        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        }

        else if (key > root.data) {
            root.right = delete(root.right, key);
        }

        else {

            // Case 1 & 2
            if (root.left == null) return root.right;

            if (root.right == null) return root.left;

            // Case 3: two children
            Node min = findMin(root.right);

            root.data = min.data;

            root.right = delete(root.right, min.data);
        }

        return root;
    }

    Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    Node insert(Node root, int key) {

        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);

        else
            root.right = insert(root.right, key);

        return root;
    }

    void inorder(Node root) {

        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        deletion_in_bst tree = new deletion_in_bst();

        Node root = null;

        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);
        root = tree.insert(root, 60);
        root = tree.insert(root, 80);

        System.out.println("Before deletion:");
        tree.inorder(root);

        root = tree.delete(root, 50);

        System.out.println("\nAfter deletion:");
        tree.inorder(root);
    }
}