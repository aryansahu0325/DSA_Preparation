
public class length {
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
        System.out.println("Count of nodes are:" + countNodes(head));
    }

    public static int countNodes(Node head) {
        int count = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            count++;
        }
        return count;
    }
}


