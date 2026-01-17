import java.util.*;
public class reverse_stack {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter values in stack");
        for(int i=1;i<=n;i++){
            int val=sc.nextInt();
            st.push(val);
        }
        System.out.println("Original Stack"+st);
        reverseStack(st);
        System.out.println("Reverse Stack"+st);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverseStack(st);
        insertbottom(st,top);
    }
    public static void insertbottom(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top=st.pop();
        insertbottom(st,val);
        st.push(top);

    }
}
