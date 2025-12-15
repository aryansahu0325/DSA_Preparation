import java.util.*;

public class remove_duplicate{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        String newstr="";
        StringBuilder sb=new StringBuilder(newstr);
        boolean map[]=new boolean[26];
        remDup(sb, str ,map, 0);
    }
    public static void remDup(StringBuilder sb, String str ,boolean map[], int idx)
    {
        if(idx==str.length())
        {
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar-'a']==true) {
            remDup(sb,str,map,idx+1);
        }
        else{
            map[currChar-'a']=true;
            remDup(sb.append(currChar),str,map,idx+1);
        }
    }
}
