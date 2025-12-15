import java.util.*;
public class frog
{
    public static void main(String args[])
    {
        int h[]={20,30,40,20};
        int i=h.length;
        int dp[]=new int[i];
        Arrays.fill(dp,-1);
        System.out.println(solve(h,i-1,dp));
        System.out.println(tab(h));
    }
    public static int solve(int h[], int i, int dp[])
    {
        if(i==0)
            return 0;
        if(dp[i]!=-1)
            return dp[i];

        //two choice
        //one jump
        int one_jump=Integer.MAX_VALUE;
        one_jump=Math.abs(h[i]-h[i-1])+solve(h,i-1,dp);
        //one jump
        int two_jump=Integer.MAX_VALUE;
        if(i>1)
        {
            two_jump=Math.abs(h[i]-h[i-2])+solve(h,i-2,dp);
        }
        return dp[i]=Math.min(one_jump,two_jump);
    }
    public static int tab(int height[])
    {
        int n=height.length;
        int dp[]=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++)
        {
            //one jump
            int one_jump= dp[i-1] + Math.abs(height[i]-height[i-1]);
            //two jump
            int two_jump=Integer.MAX_VALUE;
            if(i>1)
            {
                two_jump= dp[i-2] + Math.abs(height[i]-height[i-2]);
            }
            dp[i]=Math.min(one_jump,two_jump);
        }
        return dp[n-1];
    }
}