import java.util.*;
public class midLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list ");
        int size=sc.nextInt();
        System.out.println("Enter elements in Linked List");
        for(int i=1;i<=size;i++){
            int data=sc.nextInt();
            insert_nodes(data);
        }
        print(head);
        System.out.println("Middle of LL: "+findmid(head));
        System.out.println("Middle of LL: "+findmidl(head));
    }
    public static void insert_nodes(int data)
    {
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void print(Node head){
        for(Node temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }
        }
    }
    public static int findmid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;

    }
    public static int findmidl(Node head)
    {
        Node temp=head;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        int mid=l/2;
        while(mid>0){
            head=head.next;
            mid--;
        }
        return head.data;
    }
}
