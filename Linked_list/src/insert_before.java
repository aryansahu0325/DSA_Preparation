import java.util.*;
public class insert_before {
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
        System.out.println("Enter the value before which value has to be inserted");
        int key=sc.nextInt();
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(6);
        head.next.next.next.next=new Node(7);
        print(head);
        insertbeforeitr(head,n,key);
        print(head);
        insertbeforerec(head,n,key);
        print(head);
    }
    public static Node insertbeforeitr(Node head,int n,int k)
    {
        Node curr=head;
        Node prev=null;
        if(head==null) {
            System.out.println("Node not found");
        }
        if(head.data==k)
        {
            Node newNode=new Node(n);
            newNode.next=head;
            return head;
        }
        while(curr.data!=k)
        {
            prev=curr;
            curr=curr.next;
        }
        if(curr!=null)
        {
            Node newNode=new Node(n);
            prev.next=newNode;
            newNode.next=curr;
        }
        return head;
    }
    public static Node insertbeforerec(Node head,int n,int k)
    {
        Node curr=head;
        Node prev=null;
        if(head==null) {
            System.out.println("Node not found");
        }
        if(head.data==k)
        {
            Node newNode=new Node(n);
            newNode.next=head;
            return head;
        }
        head.next=insertbeforerec(head.next,n,k);
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
