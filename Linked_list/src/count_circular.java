import java.util.*;
public class count_circular
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
    public static Node head;
    public static Node tail;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the linked_list");
        int size=sc.nextInt();
        System.out.println("Enter values in linked list");
        for(int i=1;i<=size;i++){
            int data=sc.nextInt();
            insert_data(data);
        }
        if (tail != null) tail.next = head;
        print_list(head);
        System.out.println("Count of nodes in Cicular Nodes"+count_circu(head));
    }

    public static void print_list(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print("->");
        }
    }
    public static void insert_data(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static int count_circu(Node head){
        if(head==null){
            return 0;
        }
        Node temp=head;
        int count=1;
        for(temp=head.next;temp!=head;temp=temp.next){
            count++;
        }
        return count;
    }
}