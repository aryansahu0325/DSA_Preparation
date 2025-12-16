import java.util.*;
public class search {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of key");
            int k=sc.nextInt();
            Node head=new Node(2);
            head.next=new Node(5);
            head.next.next=new Node(9);
            head.next.next.next=new Node(1);
            head.next.next.next.next=new Node(3);
            int idx=1;
            searchNodesrec(head,k,idx);
            searchNodesIT(head,k,idx);
        }
        public static void searchNodesIT(Node head,int k,int idx)
        {
            for(Node temp=head;temp!=null;temp=temp.next){
                if(temp.data==k)
                {
                    System.out.println("Element found at position:"+idx);
                }
                idx++;
            }
            System.out.println("Elements not found");
        }
        public static void searchNodesrec(Node head,int k,int idx)
        {
            if(head==null){
                System.out.println("Element not found");
                return;
            }
            if(head.data==k)
            {
                System.out.println("Element found at position:"+idx);
                return;
            }
            searchNodesrec(head.next,k,idx+1);
        }
    }

