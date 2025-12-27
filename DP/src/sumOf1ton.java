import java.util.*;
public class sumOf1ton
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Sum of Digit of No."+sum1ton(n));
    }
    public static int sum1ton(int n)
    {
        int sum=0;
        if(n==0){
            return sum;
        }
        sum+=n;
        return sum+sum1ton(n-1);

    }
}
