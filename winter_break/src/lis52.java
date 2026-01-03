import java.util.*;

public class lis52 {

    static int LIS(int[] a, int[] dp) {
        int n = a.length;
        int[] tail = new int[n];
        int len = 0;

        for (int i = 0; i < n; i++) {
            int pos = Arrays.binarySearch(tail, 0, len, a[i]);
            if (pos < 0) pos = -pos - 1;
            tail[pos] = a[i];
            dp[i] = pos + 1;
            if (pos == len) len++;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int[] L = new int[n];
        int lis = LIS(a, L);

        // Reverse for R
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) rev[i] = -a[n - 1 - i];

        int[] Rrev = new int[n];
        LIS(rev, Rrev);

        int[] R = new int[n];
        for (int i = 0; i < n; i++) {
            R[i] = Rrev[n - 1 - i];
        }

        // Count how many elements are valid at each LIS layer
        int[] count = new int[lis + 1];
        for (int i = 0; i < n; i++) {
            if (L[i] + R[i] - 1 == lis) {
                count[L[i]]++;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (L[i] + R[i] - 1 != lis) {
                ans.append('1');
            } else if (count[L[i]] == 1) {
                ans.append('3');
            } else {
                ans.append('2');
            }
        }

        System.out.println(ans);
    }
}
