package Linked_list;

public class basic {

    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    // Method to traverse the linked list
    void traverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to insert a node at the beginning
    Node insertAtBeginning(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        basic list = new basic();  // create an object to call methods

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Original list: ");
        list.traverse(head);

        head = list.insertAtBeginning(head, 0); // insert 0 at the beginning

        System.out.print("After insertion: ");
        list.traverse(head);
    }
}
