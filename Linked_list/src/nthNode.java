import java.util.*;
public class nthNode
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
        public static void main(String args[])
        {
            Node head=new Node(1);
            head.next=new Node(2);
            head.next.next=new Node(3);
            head.next.next.next=new Node(4);
            head.next.next.next.next=new Node(5);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n=sc.nextInt();
            System.out.println("Original List");
            print(head);
            getNStart(head,n);
            System.out.println(getNStartrec(head,n));
            getNend(head,n);
        }
        public static void print(Node head)
        {
            for(Node temp = head; temp!=null; temp=temp.next)
            {
                System.out.print(temp.data);
                if(temp.next!=null)
                    System.out.print("->");
            }
            System.out.println();
        }
        public static void getNStart(Node head, int n)
        {
            Node curr=head;
            if(head==null){
                return;
            }
            for(int i=1;i<n;i++)
            {
                curr=curr.next;
            }
            System.out.println(curr.data);
        }
        public static int getNStartrec(Node head,int n)
        {
            if(head==null){
                return -1;
            }
            if(n==1)
            {
                return head.data;
            }
            return getNStartrec(head.next,n-1);
        }
        public static void getNend(Node head, int n)
        {
            Node temp = head;
            int len = 0;
            // Count the number of nodes in Linked List
            while (temp != null) {
                temp = temp.next;
                len++;
            }
            if (head == null) {
                return;
            }
            temp = head;
            for (int i = 1; i < len - n + 1; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

