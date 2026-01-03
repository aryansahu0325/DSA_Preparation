import java.util.*;

public class vacation51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[][] dp = new long[N + 1][3];

        for (int i = 1; i <= N; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            dp[i][0] = a + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = b + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = c + Math.max(dp[i - 1][0], dp[i - 1][1]);
        }

        long answer = Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2]));
        System.out.println(answer);
    }
}
