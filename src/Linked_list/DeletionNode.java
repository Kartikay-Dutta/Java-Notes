package Linked_list;

public class DeletionNode {

    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    // Method to delete a node by key
    Node deleteByKey(Node head, int key) {
        if (head == null) return null;

        // If the node to delete is the head
        if (head.data == key) {
            return head.next;
        }

        Node current = head;

        // Traverse until we find the node just before the one to delete
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        // If key found, unlink the node
        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    // Helper function to print the linked list
    void traverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main function to test
    public static void main(String[] args) {
        DeletionNode list = new DeletionNode();

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Original list: ");
        list.traverse(head);

        head = list.deleteByKey(head, 20);
        System.out.print("After deleting 20: ");
        list.traverse(head);

        head = list.deleteByKey(head, 10);
        System.out.print("After deleting 10: ");
        list.traverse(head);
    }
}
