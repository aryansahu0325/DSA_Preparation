import java.util.*;

public class knap59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();

        long[] dp = new long[W + 1];

        for (int i = 0; i < N; i++) {
            int w = sc.nextInt();
            long v = sc.nextLong();

            // 0/1 knapsack → iterate backwards
            for (int j = W; j >= w; j--) {
                dp[j] = Math.max(dp[j], dp[j - w] + v);
            }
        }

        long ans = 0;
        for (int j = 0; j <= W; j++) {
            ans = Math.max(ans, dp[j]);
        }

        System.out.println(ans);
    }
}
