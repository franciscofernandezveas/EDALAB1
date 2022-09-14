import java.util.Scanner;

public class Josefo {
        static class Node
        {
            public int data ;
            public Node next;
            public Node( int data ){
                this.data = data;
            }
        }
        static int PosicionGanadora(int m, int n){
            Node head = new Node(1);
            Node prev = head;
            for(int i = 2; i <= n; i++)
            {
                prev.next = new Node(i);
                prev = prev.next;
            }
            prev.next = head;
            Node primero = head, ptr2 = head;
              
            while(primero.next != primero){
                int count = 1;
                while(count != m)
                {
                    ptr2 = primero;
                    primero = primero.next;
                    count++;
                }
                ptr2.next = primero.next;
                primero = ptr2.next;
            }
            System.out.println ("Ganador " +primero.data);
            return n;
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int n,m;
            n = sc.nextInt();
            m = sc.nextInt();

            PosicionGanadora(m, n);
        }
    }

