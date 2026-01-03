import java.util.*;

public class max61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[][] a = new long[3][n];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextLong();
            }
        }

        long[][] dp = new long[n][3];

        // Base case (column 0)
        dp[0][0] = a[0][0];
        dp[0][1] = a[0][0] + a[1][0];
        dp[0][2] = a[0][0] + a[1][0] + a[2][0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(
                    Math.max(dp[i-1][0],
                            dp[i-1][1] + a[1][i]),
                    dp[i-1][2] + a[1][i] + a[2][i]
            ) + a[0][i];

            dp[i][1] = Math.max(
                    Math.max(dp[i-1][0],
                            dp[i-1][1]),
                    dp[i-1][2]
            ) + a[1][i];

            dp[i][2] = Math.max(
                    Math.max(dp[i-1][2],
                            dp[i-1][1] + a[1][i]),
                    dp[i-1][0] + a[0][i] + a[1][i]
            ) + a[2][i];
        }

        System.out.println(dp[n - 1][2]);
    }
}
