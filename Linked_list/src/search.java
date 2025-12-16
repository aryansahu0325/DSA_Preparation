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
            int idx=0;
            searchNodes(head,k,idx);
        }
        public static void searchNodes(Node head,int k,int idx)
        {
            if(head==null){
                System.out.println("Element not found");
                return;
            }
            if(head.data==k)
            {
                System.out.println("Element found at index"+idx);
                return;
            }
            searchNodes(head.next,k,idx+1);
        }
    }

