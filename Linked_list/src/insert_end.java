import java.util.*;
public class insert_end
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
        insert_node_end(head,n);
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
        System.out.println();
    }
    public static void insert_node_end(Node head, int n)
    {
        Node newNode=new Node(n);
        if(head==null){
            return;
        }
        for(Node temp=head;temp!=null;temp=temp.next)
        {
            if(temp.next==null) {
                temp.next = newNode;
                return;
            }
        }
    }
}

