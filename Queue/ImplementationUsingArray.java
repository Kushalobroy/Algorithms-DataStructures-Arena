import java.util.*;
import java.io.*;
class Queue{
    int front, rear, capacity;
    int[] queue;
    Queue(int c){
        front = 0;
        rear = -1;
        capacity = c;
        queue = new int[capacity];
    }

    public void enqueue(int data){
        if(rear == capacity-1){
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = data;
    }
    public void dequeue(){
        if(front > rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0;i<rear;i++){
            queue[i] = queue[i+1];
        }
        rear--;
    }
    public void display(){
        if(front > rear){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front; i<=rear; i++) System.out.print(queue[i]+"<-- ");
        System.out.println();
    }
    public void front(){
        if(rear == -1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element is: "+queue[front]);
    }
}
public class ImplementationUsingArray{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the queue: ");
        int n = sc.nextInt();
        
        Queue queue = new Queue(n);
        System.out.println("Enter "+n+" elements in Queue: ");
        for(int i=0;i<n;i++){
            queue.enqueue(sc.nextInt());
        }
        sc.close();
        queue.display();
        queue.front();
        // queue.enqueue(60);
        // queue.dequeue();
        // queue.enqueue(60);
        // queue.display();

    }
}