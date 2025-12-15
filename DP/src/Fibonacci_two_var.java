import java.util.Arrays;

public class Fibonacci_two_var
{
    public static void main(String args[])
    {
        int n=5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int result =fibbSo(n);
        System.out.println(result);
    }
    private static int fibbSo(int n)
    {
        int prev_2=0;
        int prev_1=1;
        for(int i=2;i<=n;i++)
        {
            int curr=prev_1+prev_2;
            prev_2=prev_1;
            prev_1=curr;

        }
        return prev_1;
    }


}
