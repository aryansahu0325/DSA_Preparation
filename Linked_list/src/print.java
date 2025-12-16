import java.sql.SQLOutput;

public class print {
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
    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(2);
        printNodes(head);
        printNodes1(head);
    }

    public static void printNodes(Node head) {
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.data+"->");
        }
        System.out.println("null");

    }
    public static void printNodes1(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data);
        if (head.next != null)
            System.out.print("->");
        printNodes1(head.next);
    }
}


