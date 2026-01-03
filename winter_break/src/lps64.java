import java.util.*;

public class lps64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Transform string
        StringBuilder t = new StringBuilder("^");
        for (char c : s.toCharArray()) {
            t.append("#").append(c);
        }
        t.append("#$");

        char[] arr = t.toString().toCharArray();
        int n = arr.length;
        int[] p = new int[n];

        int center = 0, right = 0;
        int maxLen = 0, centerIndex = 0;

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Expand around center i
            while (arr[i + 1 + p[i]] == arr[i - 1 - p[i]]) {
                p[i]++;
            }

            // Update center & right boundary
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // Track maximum palindrome
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        // Extract palindrome
        int start = (centerIndex - maxLen) / 2;
        System.out.println(s.substring(start, start + maxLen));
    }
}
