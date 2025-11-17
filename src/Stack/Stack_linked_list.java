package Stack;

public class Stack_linked_list {
    class Node{
        int data;
        Node next;
        Node(int d){data=d;}
    }
    class StackLinkedList{
        private Node top;

        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = top;
        }
        public int pop(){
            if(top==null){
                System.out.println("Stack Underflow");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }
        public int peek(){
            if(top==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.data;
        }

    }
}
