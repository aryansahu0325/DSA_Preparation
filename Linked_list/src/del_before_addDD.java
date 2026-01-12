import java.util.*;
public class del_before_addDD                //TC:O(n) and SC:O(n)
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
        System.out.println("Enter the node data before which data is to be added or deleted");
        int key=sc.nextInt();
        head=add_before(head,data,key);
        System.out.println("Updated List after adding");
        print_list(head);
        head=del_before(head,key);
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
    public static Node add_before(Node head,int data,int key){
        Node newNode=new Node(data);
        if(head==null){

            return newNode ;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==key) {
                break;
            }
            temp=temp.next;
        }
        newNode.prev=temp.prev;
        newNode.next=temp;
        temp.prev.next=newNode;
        return head;
    }
    public static Node del_before(Node head,int key) {
        if(head==null||head.next==null){     //if the list is empty or contains only one node
            return null ;
        }
        Node temp=head;
        //to traverse the linked list
        while(temp!=null){
            if(temp.data==key) {
                break;
            }
            temp=temp.next;
        }
        //if key is at the head or we do not find any key
        if(temp==null&&temp.prev==null){
            return head;
        }
        Node nodeDel=temp.prev;
        if(nodeDel==head){
            head=temp;
            head.prev=null;
        }
        else {
            nodeDel.prev.next = temp;
            temp.prev = nodeDel.prev;
        }
        return head;
    }
}