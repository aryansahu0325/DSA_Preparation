import java.util.*;
public class insert
{
    public static class Node
    {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            Node head=new Node(2);
            head.next=new Node(6);
            head.next.next=new Node(5);
            head.next.next.next=new Node(1);
            head.next.next.next.next=new Node(8);
            System.out.println("Original List");
            print_list(head);
            System.out.println("Enter the value to inserted");
            int n=sc.nextInt();
            head=insert_node_begin(head,n);
            System.out.println("Updated list");
            print_list(head);
        }
        public static void print_list(Node head)
        {
            if(head==null)
            {
                return;
            }
            System.out.print(head.data);
            if(head.next!=null)
                System.out.print("->");
            print_list(head.next);

        }
        public static Node insert_node_begin(Node head, int n)
        {
            Node newNode=new Node(n);
            newNode.next=head;
            return newNode;
        }
    }

