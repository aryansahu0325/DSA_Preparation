public class delete_begin {
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
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        System.out.println("Original List");
        print(head);
        head=deletefront(head);
        System.out.println("Updated List");
        print(head);
    }
    public static Node deletefront(Node head)
    {
        if(head==null){
            return null;
        }
        Node temp=head;
        head=head.next;
        return head;
    }
    public static void print(Node head)
    {
        for(Node temp=head;temp!=null;temp=temp.next)
        {
            System.out.print(temp.data);
            if(temp.next!=null)
                System.out.print("->");
        }
        System.out.println();
    }
}
