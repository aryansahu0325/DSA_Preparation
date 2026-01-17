import java.util.*;
public class Sort_Stack {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=n;i++){
            int val=sc.nextInt();
            st.push(val);
        }
        System.out.println("Original Stack"+st);
        sortStack(st);
        System.out.println("Sorted Stack"+st);
    }
    public static void sortStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        sortStack(st);
        insertSorted(st,top);
    }
    public static void insertSorted(Stack<Integer> st, int val){
        if(st.isEmpty()||st.peek()<=val){
            st.push(val);
            return;
        }
        int top=st.pop();
        insertSorted(st,val);
        st.push(top);
    }
}
