import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    public Node(int n) {
        left = null;
        right = null;
        data = n;
    }
}

class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }
}

public class LinkedListBST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BST bst = new BST();

        System.out.println("Linked List Binary Search Tree Test\n");
        char ch;

        do {
            System.out.print("Enter integer element to insert: ");
            bst.insert(scan.nextInt());

            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order  : ");
            bst.preorder();
            System.out.print("\nIn order   : ");
            bst.inorder();

            System.out.println("\n\nDo you want to continue (Type y or n)?");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        scan.close();
    }
}