import java.util.*;

public class count62 {

    static final int MOD = 1000000007;
    static final int MAXN = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // dp[i][0] = separate
        // dp[i][1] = connected
        long[][] dp = new long[MAXN + 1][2];

        // base case
        dp[1][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i <= MAXN; i++) {
            dp[i][0] = (2 * dp[i - 1][0] + dp[i - 1][1]) % MOD;
            dp[i][1] = (dp[i - 1][0] + 4 * dp[i - 1][1]) % MOD;
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long ans = (dp[n][0] + dp[n][1]) % MOD;
            System.out.println(ans);
        }
    }
}
