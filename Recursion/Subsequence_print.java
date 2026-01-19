import java.util.*;
public class Subsequence_print
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=sc.next();   //index always taken in subsequuence question
        String curr="";
        int idx=0;
        printsub(idx,st,curr);
    }
    public static void printsub(int idx, String st, String curr)
    {
        if (idx == st.length()) {
            System.out.println(curr);
            return;
        }
        //take condition
        printsub(idx+1,st,curr+st.charAt(idx));
        //nottake calling
        printsub(idx+1,st,curr);
    }
}
