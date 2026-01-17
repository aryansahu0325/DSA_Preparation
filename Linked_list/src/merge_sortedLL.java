import java.util.*;

public class merge_sortedLL {

    // ---------- Node ----------
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]) {

        Node head1 = null;
        Node head2 = null;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = sc.nextInt();

        // ---------- List 1 ----------
        System.out.println("Enter elements in Linked List 1 (sorted)");
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            head1 = insert_nodes(head1, data);
        }

        // ---------- List 2 ----------
        System.out.println("Enter elements in Linked List 2 (sorted)");
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            head2 = insert_nodes(head2, data);
        }

        System.out.print("First Linked List:  ");
        print(head1);

        System.out.print("\nSecond Linked List: ");
        print(head2);

        // ---------- Merge ----------
        Node res = merge(head1, head2);

        System.out.print("\nMerged Linked List: ");
        print(res);
    }

    // ---------- Insert at End ----------
    public static Node insert_nodes(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }

    // ---------- Print ----------
    public static void print(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print("->");
        }
        System.out.println();
    }

    // ---------- Merge Two Sorted Lists ----------
    public static Node merge(Node head1, Node head2) {

        if (head1 == null) return head2;
        if (head2 == null) return head1;

        if (head1.data <= head2.data) {
            head1.next = merge(head1.next, head2);
            return head1;
        } else {
            head2.next = merge(head1, head2.next);
            return head2;
        }
    }
}
