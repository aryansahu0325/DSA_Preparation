import java.util.*;
public class insert_after {
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
        System.out.println("Enter the value after which value has to be inserted");
        int k=sc.nextInt();
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(6);
        head.next.next.next.next=new Node(7);
        print(head);
        insertafter(head,n,k);
        print(head);
    }
    public static Node insertafter(Node head,int n,int k)
    {
        Node temp=head;
        if(temp==null) {
            System.out.println("Node not found");
        }
        while(temp!=null)
        {
            if(temp.data==k) {
                break;
            }
            temp=temp.next;
        }
        Node newNode=new Node(n);
        newNode.next=temp.next;
        temp.next=newNode;
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
