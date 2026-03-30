package queue;
 class Main{
     static  int[] q = new int[5];
     static int front = -1;
     static int rear = -1;

     static void enqueue(int x){
         if((rear+1)%5 == front){
             System.out.println("overflow");
             return;
         }
         if(front == -1) front = 0;

         rear = (rear+1)%50;
         q[rear] = x;
     }
     static void dequeue(){

         if(front == -1){
             System.out.println("underflow");
             return;
         }
         if(front ==rear){
             front = rear = -1;
             return;
         }
         front = (front +1) % 5;
     }
     static void display(){
         if(front == -1) return;

         int i = front;
         while(true){
             System.out.println(q[i]+ " ");
             if(i == rear) break;
             i = (i+1) % 5;
         }
     }

     public static void main(String[] args) {
         enqueue(10);
         enqueue(20);
         enqueue(30);

         dequeue();
         enqueue(40);
         display();


     }
 }