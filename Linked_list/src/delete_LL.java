public class delete_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String args[])
    {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node (3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        System.out.println("Original List");
        print(head);
        System.out.println("Updated List");
        head=deleteLL(head);
        print(head);
    }
    public static void print(Node head)
    {
        for(Node temp = head; temp!=null; temp=temp.next)
        {
            System.out.print(temp.data);
            if(temp.next!=null)
                System.out.print("->");
        }
        System.out.println();
    }
    public static Node deleteLL(Node head)
    {
        head=null;
        System.out.println("Null");
        return head;

    }
}
