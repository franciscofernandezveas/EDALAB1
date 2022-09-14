import java.util.*;


public class ejercicioB {
    static class Node
{
    int data;
    Node next;   //creamos un nodo
}
 static Node head = null;

static Node Voltear(Node head, int n){
    
    Stack<Node> stack = new Stack<Node> ();
    Node current = head;
    Node prev = null;
 
    while (current != null){
        int count = 0;
        while (current != null && count < k)
        {
            stack.push(current);
            current = current.next;
            count++;
        }
        while (stack.size() > 0){
            if (prev == null)
            {
                prev = stack.peek();
                head = prev;
                stack.pop();
            }
            else
            {
                prev.next = stack.peek();
                prev = prev.next;
                stack.pop();
            }
        }
    }
    prev.next = null;
 
    return head;
}
static void push( int new_data){
    Node new_node = new Node();
    new_node.data = new_data;
    new_node.next = head;
    head = new_node;
}
static void printList(Node node)
{
    while (node != null)
    {
        System.out.print(node.data + " ");
        node = node.next;
    }
}

public static void main(String[] args){
    push( 9);
    push( 8);
    push( 7);
    push( 6);
    push( 5);
    push(4);
    push(3);
    push(2);
    push( 1);
 
    printList(head);
    head = Voltear(head, 3);
    System.out.println();
 
    System.out.println(" Linked list Invertida ");
    printList(head);
}
}
