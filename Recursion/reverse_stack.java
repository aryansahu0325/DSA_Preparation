import java.util.*;

public class reverse_stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        System.out.println("Original Stack: " + st);

        sortStack(st);
        System.out.println("Sorted Stack:   " + st);

        reverseStack(st);
        System.out.println("Reversed Stack: " + st);
    }

    // ---------------- SORT STACK ----------------
    public static void sortStack(Stack<Integer> st){
        if(st.isEmpty())
            return;

        int top = st.pop();
        sortStack(st);
        insertInSortedOrder(st, top);
    }

    public static void insertInSortedOrder(Stack<Integer> st, int val){
        if(st.isEmpty() || st.peek() <= val){
            st.push(val);
            return;
        }

        int top = st.pop();
        insertInSortedOrder(st, val);
        st.push(top);
    }

    // ---------------- REVERSE STACK ----------------
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty())
            return;

        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }

    public static void insertAtBottom(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, val);
        st.push(top);
    }
}
