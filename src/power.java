import java.util.*;
public class power {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        System.out.println("Enter power");
        int x=sc.nextInt();
        System.out.println(pow(n,x));
    }
    public static int pow(int n,int x)
    {
        if(x==0) {
            return 1;
        }
        else
            return n*pow(n,x-1);
    }
}
