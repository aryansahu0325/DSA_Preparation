import java.util.*;
public class gcd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b)
    {
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

}
