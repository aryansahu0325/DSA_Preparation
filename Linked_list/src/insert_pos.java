import java.util.*;
public class insert_pos {
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to be inserted");
        int n=sc.nextInt();
        System.out.println("Enter the position");
        int p=sc.nextInt();
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(6);
        head.next.next.next.next=new Node(7);
        print(head);
        insertpos(head,n,p);
        print(head);
    }
    public static Node insertpos(Node head,int n,int p)
    {
        Node curr=head;
        for(int i=1;i<p-1;i++)
        {
            curr=curr.next;
        }
        Node newNode=new Node(n);
        newNode.next=curr.next;
        curr.next=newNode;
        return head;
    }
    public static void print(Node head)
    {
        Node temp=head;
        for(temp=head;temp!=null;temp=temp.next)
        {
            System.out.print(temp.data);
            if(temp.next!=null)
            {
                System.out.print("->");
            }
        }
    }
}
