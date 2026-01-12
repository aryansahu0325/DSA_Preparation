import java.util.*;
public class del_position_addDD                //TC:O(n) and SC:O(n)
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
        System.out.println("Enter data to inserted ");
        int data=sc.nextInt();
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        head=add_position(head,data,pos);
        System.out.println("Updated List after adding");
        print_list(head);
        head=del_position(head,pos);
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
        System.out.println();
    }
    public static void insert_data(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public static Node add_position(Node head,int data,int pos){
        Node newNode=new Node(data);
        if(head==null){
            return newNode ;
        }
        if(pos==1){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        Node temp=head;
        //to traverse the linked list
        for(int i=1;temp!=null&&i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        if (temp.next != null) {
            // If not at the end, link the next node back to newNode
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        return head;
    }
    public static Node del_position(Node head,int pos) {
        if(head==null){     //if the list is empty or contains only one node
            return null ;
        }
        if (pos == 1){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
        }
        Node temp=head;
        //to traverse the linked list
        for(int i=1;temp!=null&&i<pos;i++){
            temp=temp.next;
        }
        //if key is at the head or we do not find any key
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        return head;
    }
}