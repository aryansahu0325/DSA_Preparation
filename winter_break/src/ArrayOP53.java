import java.util.*;

public class ArrayOP53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long score = 0;
            int l = 0, r = n - 1;

            // Perform k operations
            for (int i = 0; i < k; i++) {
                score += a[l] / a[r]; // floor division
                l++;
                r--;
            }

            // Add remaining elements
            for (int i = l; i <= r; i++) {
                score += a[i];
            }

            System.out.println(score);
        }
    }
}
