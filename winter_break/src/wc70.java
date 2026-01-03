import java.util.*;

public class wc70 {

    static final int MOD = 1000000007;

    // Trie Node
    static class TrieNode {
        TrieNode[] next = new TrieNode[26];
        boolean isEnd;
    }

    static TrieNode root = new TrieNode();

    static void insert(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (cur.next[idx] == null) {
                cur.next[idx] = new TrieNode();
            }
            cur = cur.next[idx];
        }
        cur.isEnd = true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            insert(sc.next());
        }

        int[] dp = new int[n + 1];
        dp[n] = 1; // base case

        // DP from right to left
        for (int i = n - 1; i >= 0; i--) {
            TrieNode cur = root;
            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                if (cur.next[idx] == null) break;

                cur = cur.next[idx];
                if (cur.isEnd) {
                    dp[i] = (dp[i] + dp[j + 1]) % MOD;
                }
            }
        }

        System.out.println(dp[0]);
    }
}
