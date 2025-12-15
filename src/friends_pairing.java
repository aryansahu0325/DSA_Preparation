import java.util.*;
public class friends_pairing {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of friends");
        int n=sc.nextInt();
        System.out.println(friendspair(n));
    }
    public static int friendspair(int n)
    {
        if(n==1||n==2){
            return n;
        }
        return friendspair(n-1)+(n-1)*friendspair(n-2);
    }
}
