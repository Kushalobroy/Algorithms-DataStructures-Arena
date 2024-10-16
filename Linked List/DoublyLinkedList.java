import java.util.*;
class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList{
    public static void forwardTraversal(Node head){
        Node curr = head;
        while ((curr != null)) {
            System.out.print(curr.data +" ");
            curr = curr.next; 
        }
        System.out.println();
    }
    public static void backwardTraversal(Node tail){
        Node curr = tail;
        while(curr !=null){
            System.out.print(curr.data+" ");
            curr = curr.prev;
        }
        System.out.println();
    }
    public static int getLength(Node head){
        int count=0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
    
    public static void main(String[] args){
      
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        //System.out.println(head.data);
        // forwardTraversal(head);
        // backwardTraversal(third);
        //System.out.println(getLength(head));
    }
}