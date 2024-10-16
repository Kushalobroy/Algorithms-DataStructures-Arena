
import java.util.*;
public class HeightOfTree{
    static class Node{
        char key;
        Vector<Node> child;
    }
    static Node newNode(int key){
        Node temp = new Node();
        temp.key = (char)key;
        temp.child = new Vector<Node>();
        return temp;
    }
    static int depthOfTree(Node ptr){
        if(ptr == null) return 0;
        int maxDepth = 0;
        for(Node i:ptr.child)
            maxDepth = Math.max(maxDepth, depthOfTree(i));
        return maxDepth+1;
    }
    public static void main(String[] args){
         /* Let us create below tree
        *             A
        *          / / \ \
        *         B F D  E
        *        / \  | /|\
        *        K J G  C H I
        *       /\          \
        *       N M          L
        */
        Node root = newNode('A');
        root.child.add(newNode('B'));
        root.child.add(newNode('F'));
        root.child.add(newNode('D'));
        root.child.add(newNode('E'));
        root.child.get(0).child.add(newNode('K'));
        root.child.get(0).child.add(newNode('J'));
        root.child.get(2).child.add(newNode('G'));
        root.child.get(3).child.add(newNode('C'));
        root.child.get(3).child.add(newNode('H'));
        root.child.get(3).child.add(newNode('I'));
        root.child.get(0).child.get(0).child.add(newNode('N'));
        root.child.get(0).child.get(0).child.add(newNode('M'));
        root.child.get(3).child.get(2).child.add(newNode('L'));
        root.child.get(3).child.get(2).child.get(0).child.add(newNode('L'));
        System.out.println(depthOfTree(root));
    }
}