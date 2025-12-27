import java.util.ArrayList;
import java.util.Stack;

public class mid_stack
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
        deletemid(st,size);
    }
    public static void deletemid(Stack<Integer> st,int size)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int mid=size/2;
        while(!st.isEmpty())
        {
            list.add(st.pop());
        }
        list.remove(mid);
        System.out.println(list);


    }
}
