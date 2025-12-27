import java.util.*;
public class Tiling {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n dimension");
        int n=sc.nextInt();
        System.out.println(noofways(n));
    }
    public static int noofways(int n)
    {
        int ans=0;
        if(n==0||n==1){
            return 1;
        }
        //vertical
        ans=noofways(n-1);
        //horizontal
        ans+=noofways(n-2);
        return ans;
    }
}
