import java.util.*;
public class delete_pos {
    public static class Node{
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
        Scanner sc=new Scanner(System.in);
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node (3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        System.out.println("Enter thr position");
        int p=sc.nextInt();
        System.out.println("Original List");
        print(head);
        head=deletepos(head,p);
        System.out.println("Updated List");
        print(head);
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
    public static Node deletepos(Node head,int p)
    {
        Node temp=head;
        Node prev=null;
        if(p==1)
        {
            head=temp.next;
            return head;
        }
        for(int i=1;i<p;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        return head;
    }
}
