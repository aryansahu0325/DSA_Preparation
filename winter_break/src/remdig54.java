import java.util.*;

public class remdig54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int x = i;
            while (x > 0) {
                int digit = x % 10;
                x /= 10;

                if (digit > 0) {
                    dp[i] = Math.min(dp[i], dp[i - digit] + 1);
                }
            }
        }

        System.out.println(dp[n]);
    }
}
