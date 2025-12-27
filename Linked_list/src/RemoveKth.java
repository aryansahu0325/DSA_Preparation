import java.util.*;
public class RemoveKth {
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
        System.out.println("Emter the value of k ");
        int k=sc.nextInt();
        head=removek(head,k);
        System.out.println("Updated List:");
        print(head);

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
    public static Node removek(Node head,int k)
    {
        int count=0;
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            count++;
            if (count % k == 0)
            {
                if (prev != null)
                {
                    prev.next = curr.next;
                }
                else
                {
                    head = curr.next;
                }
            }
            else
            {
                prev = curr;
            }
            curr=curr.next;
        }
        return head;
    }
}
