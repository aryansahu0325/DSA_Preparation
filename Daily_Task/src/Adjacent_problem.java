import java.util.*;

public class Adjacent_problem {

    public static long dp[][][];
    public static char num[];

    public static long count(int pos, int last, int tight) {
        if (pos == num.length) return 1;

        if (dp[pos][last][tight] != -1)
            return dp[pos][last][tight];

        long res = 0;
        int limit = tight == 1 ? num[pos] - '0' : 9;

        for (int d = 0; d <= limit; d++) {
            if (last == -1 || d != last) {
                res += count(
                        pos + 1,
                        d,
                        (tight == 1 && d == limit) ? 1 : 0
                );
            }
        }
        return dp[pos][last][tight] = res;
    }

    public static long solve(long x) {
        if (x < 0) return 0;
        num = Long.toString(x).toCharArray();
        dp = new long[num.length][11][2];
        for (long[][] a : dp)
            for (long[] b : a)
                Arrays.fill(b, -1);
        return count(0, -1, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(solve(b) - solve(a - 1));
    }
}
