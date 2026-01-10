import java.util.*;
public class del_end_CC                //TC:O(n) and SC:O(n)
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
        System.out.println("Original List");
        print_list(head);
        head=del_end(head);
        System.out.println("Updated List");
        print_list(head);
    }
    public static void print_list(Node head) {
        Node temp=head;
        System.out.print(temp.data+"->");
        for (temp = head.next; temp != head; temp = temp.next) {
            System.out.print(temp.data);
            if (temp.next != head)
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
    public static Node del_end(Node head){
        if(head==null||head.next==head){
            return null;
        }
        Node temp=head;
        Node prev=null;
        Node curr=head;
        while(temp.next!=head){
            temp=temp.next;
            prev=curr;
            curr=prev.next;
        }
        prev.next=head;
        return head;
    }
}