import java.util.*;
class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data = new_data;
        this.next = null;
    }
}
class Queue{
    Node front, rear;
    Queue(){rear = front = null;}
    boolean isEmpty(){
        return front == null && rear == null;
    }
    void enqueue(int new_data){
        Node new_node = new Node(new_data);
        if(rear == null){
            front = rear = new_node;
            return;
        }
        rear.next = new_node;
        rear = new_node;
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return;
        }
        Node temp = front;
        front = front.next;
        if(front == null){
            rear = null;
        }
    }
    int getFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }
    int getRear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return rear.data;
    }
}
public class ImplementationUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        System.out.println("Enter The number which you wanna to insert in Queue: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            queue.enqueue(sc.nextInt());
        }
        System.out.println("Queue Front: "+queue.getFront());
        System.out.println("Queue Rear: "+queue.getRear());
        queue.dequeue();
        System.out.println("Queue Front: "+queue.getFront());
        System.out.println("Queue Rear: "+queue.getRear());

    }
}
