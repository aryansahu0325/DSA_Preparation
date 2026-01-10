import java.util.*;
public class single_circular
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
        System.out.println("Original Linked List");
        print_list(head);
        //Iterative
        head=sing_ciritr(head);
        System.out.println("Updated List after Iteration");
        print_listcc(head);
        //break circle
        breakCircle(head);
        //recursive circular
        sing_cirrec(head,head);
        System.out.println("Updated List after Recursion");
        print_listcc(head);
    }
    public static void breakCircle(Node head) {
        if (head == null)
            return;

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public static void print_listcc(Node head) {
        if(head==null){
            System.out.println("List Empty");
        }
        System.out.print(head.data+"->");
        for (Node temp = head.next; temp != head; temp = temp.next) {
            System.out.print(temp.data);
            if (temp.next != head)
                System.out.print("->");
        }
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
    public static void insert_data(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static Node sing_ciritr(Node head){
        if(head==null)
            return null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return head;
    }
    public static void sing_cirrec(Node curr, Node head){
        if(curr.next==null){
            curr.next=head;
            return ;
        }
        sing_cirrec(curr.next,head);

    }
}
