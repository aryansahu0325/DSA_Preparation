import java.util.*;
public class binary {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        printbin(n,0," ");
    }
    public static void printbin(int n, int lastplace, String str)
    {
        if(n==0){
            System.out.println(str);
            return;
        }
        printbin(n-1,0,str+"0");
        if(lastplace==0){
            printbin(n-1,1,str+"1");
        }
    }
}
