import java.util.*;

public class hgrid60 {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] grid = new char[H][W];
        for (int i = 0; i < H; i++) {
            grid[i] = sc.next().toCharArray();
        }

        int[][] dp = new int[H][W];
        dp[0][0] = 1;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '#') {
                    dp[i][j] = 0;
                    continue;
                }

                if (i > 0) dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
                if (j > 0) dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD;
            }
        }

        System.out.println(dp[H - 1][W - 1]);
    }
}
