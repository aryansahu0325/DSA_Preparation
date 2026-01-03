import java.util.*;

public class cs65 {

    static int n, m, k;
    static String s1, s2, virus;
    static int[][] automaton;
    static int[][][] dp;
    static int[][][][] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s1 = sc.next();
        s2 = sc.next();
        virus = sc.next();

        n = s1.length();
        m = s2.length();
        k = virus.length();

        buildAutomaton();

        dp = new int[n + 1][m + 1][k];
        for (int[][] layer : dp)
            for (int[] row : layer)
                Arrays.fill(row, -1);

        parent = new int[n + 1][m + 1][k][3];

        int ans = solve(0, 0, 0);

        if (ans <= 0) {
            System.out.println(0);
            return;
        }

        StringBuilder res = new StringBuilder();
        reconstruct(0, 0, 0, res);
        System.out.println(res);
    }

    static int solve(int i, int j, int l) {
        if (i == n || j == m) return 0;
        if (dp[i][j][l] != -1) return dp[i][j][l];

        int best = solve(i + 1, j, l);
        parent[i][j][l] = new int[]{i + 1, j, l};

        int skip2 = solve(i, j + 1, l);
        if (skip2 > best) {
            best = skip2;
            parent[i][j][l] = new int[]{i, j + 1, l};
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            int nl = automaton[l][s1.charAt(i) - 'A'];
            if (nl < k) {
                int take = 1 + solve(i + 1, j + 1, nl);
                if (take > best) {
                    best = take;
                    parent[i][j][l] = new int[]{i + 1, j + 1, nl};
                }
            }
        }

        return dp[i][j][l] = best;
    }

    static void reconstruct(int i, int j, int l, StringBuilder res) {
        if (i == n || j == m) return;
        int[] p = parent[i][j][l];
        if (p[0] == i + 1 && p[1] == j + 1) {
            res.append(s1.charAt(i));
        }
        reconstruct(p[0], p[1], p[2], res);
    }

    static void buildAutomaton() {
        automaton = new int[k][26];
        int[] pi = new int[k];

        for (int i = 1; i < k; i++) {
            int j = pi[i - 1];
            while (j > 0 && virus.charAt(i) != virus.charAt(j))
                j = pi[j - 1];
            if (virus.charAt(i) == virus.charAt(j)) j++;
            pi[i] = j;
        }

        for (int i = 0; i < k; i++) {
            for (int c = 0; c < 26; c++) {
                int j = i;
                while (j > 0 && virus.charAt(j) != (char) (c + 'A'))
                    j = pi[j - 1];
                if (virus.charAt(j) == (char) (c + 'A')) j++;
                automaton[i][c] = j;
            }
        }
    }
}
