import java.util.*;
public class del_begin_addDD                //TC:O(n) and SC:O(n)
{
    public static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
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
        System.out.println("Original List");
        print_list(head);
        System.out.println("Enter data to inserted at first node");
        int data=sc.nextInt();
        head=add_begin(head,data);
        System.out.println("Updated List after adding");
        print_list(head);
        head=del_begin(head);
        System.out.println("Updated List after deleting");
        print_list(head);

    }
    public static void print_list(Node head) {
        Node temp=head;
        for (temp = head; temp != null; temp = temp.next) {
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
    public static Node add_begin(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode ;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return head;
    }
    public static Node del_begin(Node head){
        if(head==null||head.next==null){
            return null ;
        }
        head=head.next;
        head.prev=null;
        return head;
    }
}