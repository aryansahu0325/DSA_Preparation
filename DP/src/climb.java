import java.util.*;
class climb
{
    public static void main(String[] args){
        int n=5;
        System.out.println(climb_rec(n));
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(climb_dp(n,ways));
        System.out.println(climbT(n));
    }
    public static int climb_rec(int n)
    {
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return climb_rec(n-1)+climb_rec(n-2);
    }
    public static int climb_dp(int n, int ways[])
    {
        if(n==0){
            return 1;
        }
        if(n<0) {
            return 0;
        }
        if(ways[n]!=-1)
            return ways[n];
        return ways[n]=climb_dp(n-1,ways)+climb_dp(n-2,ways);
    }
    public static int climbT(int n)
    {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}