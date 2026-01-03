import java.util.*;

public class lcs63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];

        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        for (int j = 0; j < m; j++) B[j] = sc.nextInt();

        // DP table
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Print length
        System.out.println(dp[n][m]);

        // Reconstruct one LCS
        List<Integer> lcs = new ArrayList<>();
        int i = n, j = m;

        while (i > 0 && j > 0) {
            if (A[i - 1] == B[j - 1]) {
                lcs.add(A[i - 1]);
                i--;
                j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // LCS was built backwards
        Collections.reverse(lcs);

        // Print LCS
        for (int x : lcs) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
