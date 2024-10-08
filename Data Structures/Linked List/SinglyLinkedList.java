import java.util.*;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List{
    private Node head;

    public List(){
        this.head = null;
    }

    public void addToFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addToEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) curr = curr.next;
        curr.next = newNode;
        return;
    }
    public void addToSpecificPosition(int pos, int data){
        if(pos < 1) {
            System.out.println("Invalid Position");
            return;
        }
        if(pos == 1){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            return;
        }
        Node prev = head;
        int count = 1;
        while(count<pos-1 && prev !=null){
            prev = prev.next;
            count++;
        }
        if(prev == null){
            System.out.println("Invalid Position!");
            return;
        }
        Node temp = new Node(data);
        temp.next = prev.next;
        prev.next = temp;
        return;
    }
    public void deleteAtFront(){
        if(head == null){ return;}
        Node temp = head;
        head = head.next;
        return;
    }
    public void deleteAtEnd(){
        if(head == null){ return;}
        if(head.next == null){ head = null; return;}
        Node secondLast = head;
        while(secondLast.next.next != null) secondLast = secondLast.next;
        secondLast.next = null;
        return;
    }
    public void deleteAtSpecificPosition(int pos){
        if(pos < 1 || head == null) {
            System.out.println("Invalid Position");
            return;
        }
        if(pos == 1){
            Node temp = head;
            head = head.next;
            temp = null;
            return;
        }
        Node curr = head;
        for(int i=1;i<pos - 1 && curr != null; i++) curr = curr.next;
        if(curr == null || curr.next == null) { return; }
        Node temp = curr.next;
        curr.next = temp.next;
        temp = null;
        return;
    }
    public void search(int target){
        Node current = head;
        while(current != null){
            if(current.data == target){
                System.out.println(target +" Found in the List");
                return;
            }
            current = current.next;
        }
        System.out.println(target +" Not Found in the List");
    }
    public int size(){
        int count=0;
        Node curr = head;
        while(curr !=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public void printList(){
        Node curr = head;
        while (curr !=null) {
            System.out.print(curr.data +" ->");
            curr = curr.next;
        }
        System.out.println();
    }
    
}
public class SinglyLinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new List();
        list.addToFront(10);
        list.addToFront(12);
        list.addToFront(13);
        list.addToFront(14);
        list.addToFront(15);
        //list.printList();
       // list.search(14);
      // System.out.println(list.size());
        //list.addToEnd(16);
        list.printList();
       // list.addToSpecificPosition(3, 40);
       //list.deleteAtFront();
        // list.printList();
        //list.deleteAtEnd();
        //list.printList();
        list.deleteAtSpecificPosition(2);
        list.printList();
    }
}


