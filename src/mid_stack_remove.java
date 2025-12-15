import java.util.Stack;

public class mid_stack_remove
{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(5);
        st.push(9);
        st.push(5);
        st.push(7);
        st.push(4);
        int size=st.size();
        int mid=size/2;
        deletemid(st,mid);
        System.out.println(st);
    }
    public static void deletemid(Stack<Integer> st, int mid)
    {
        if(mid==1)
        {
            st.pop();
            return;
        }
        int temp=st.pop();
        deletemid(st,mid-1);
        st.push(temp);
    }
}