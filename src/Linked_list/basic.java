package Linked_list;

public class basic {

    static class Node {  // make Node static so it can be used in main
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    void traverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        basic list = new basic();  // create an object to call traverse()

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        list.traverse(head);  // call the traverse method
    }
}
