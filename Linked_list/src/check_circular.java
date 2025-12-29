import java.util.*;
public class check_circular {
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list ");
        int size = sc.nextInt();
        System.out.println("Enter elements in Linked List");
        for (int i = 1; i <= size; i++) {
            int data = sc.nextInt();
            insert_nodes(data);
        }
        print(head);
        System.out.println(check(head));
    }

    public static void insert_nodes(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            }
        }
    }

    public static boolean check(Node head) {
        int count=0;
        if(head==null){
            return true;
        }
        Node temp=head;
        while(head!=null && head.next!=temp){
            head=head.next;

        }
        if(head==null||head.next==null)
            return false;
        return true;
    }
}
