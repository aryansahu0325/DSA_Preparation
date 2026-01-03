import java.util.*;

public class pp69{

    // Manacher for odd-length palindromes
    static int[] manacherOdd(String s) {
        int n = s.length();
        int[] d = new int[n];
        int l = 0, r = -1;

        for (int i = 0; i < n; i++) {
            int k = (i > r) ? 1 : Math.min(d[l + r - i], r - i + 1);
            while (i - k >= 0 && i + k < n && s.charAt(i - k) == s.charAt(i + k)) {
                k++;
            }
            d[i] = k;
            if (i + k - 1 > r) {
                l = i - k + 1;
                r = i + k - 1;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            // Step 1: Manacher (odd palindromes)
            int[] d1 = manacherOdd(s);

            // badEnd[r] = max l such that [l..r] contains an odd palindrome (len >= 3)
            int[] badEnd = new int[n];
            Arrays.fill(badEnd, -1);

            for (int i = 0; i < n; i++) {
                if (d1[i] >= 2) { // odd palindrome length >= 3
                    int l = i - (d1[i] - 1);
                    int r = i + (d1[i] - 1);
                    badEnd[r] = Math.max(badEnd[r], l);
                }
            }

            // Propagate bad intervals
            for (int i = 1; i < n; i++) {
                badEnd[i] = Math.max(badEnd[i], badEnd[i - 1]);
            }

            long ans = 0;

            // Count beautiful substrings
            for (int r = 0; r < n; r++) {
                int minL = badEnd[r] + 1;
                int len = r - minL + 1;

                if (len <= 0) continue;

                // only even-length substrings
                ans += len / 2;
            }

            System.out.println(ans);
        }
    }
}
