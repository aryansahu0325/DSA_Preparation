import java.sql.SQLOutput;
import java.util.*;
public class reverse_single {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the Linked list");
            int size=sc.nextInt();
            System.out.println("Enter elements in the linked list");
            for(int i=1;i<=size;i++){
                int data=sc.nextInt();
                insert_data(data);
            }
            System.out.println("Original List");
            print_list();
            System.out.println("Reversed List");
            reverse();
            print_list();
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
        public static void print_list() {
            Node temp=head;
            for(temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data);
                if (temp.next != null)
                    System.out.print("->");
            }
            System.out.println();
        }
        public static void reverse(){
            Node prev=null;
            Node next=null;
            for(Node curr=head;curr!=null;curr=next){
                next=curr.next;
                curr.next=prev;
                prev=curr;
            }
            head=prev;
        }

    }

