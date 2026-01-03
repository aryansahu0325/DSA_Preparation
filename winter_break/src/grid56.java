import java.util.*;
public class grid56 {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            grid[i] = sc.next().toCharArray();
        }

        int[][] dp = new int[n][n];

        if (grid[0][0] == '.') {
            dp[0][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '*') {
                    dp[i][j] = 0;
                    continue;
                }

                if (i > 0) dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
                if (j > 0) dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD;
            }
        }

        System.out.println(dp[n - 1][n - 1]);
    }
}
