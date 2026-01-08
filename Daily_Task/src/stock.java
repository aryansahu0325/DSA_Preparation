import java.util.*;

class stock {
    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int n = arr.length;

        int[] dp = new int[n];
        int[] parent = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);

        int max = 0, last = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
            if (dp[i] > max) {
                max = dp[i];
                last = i;
            }
        }

        ArrayList<Integer> lis = new ArrayList<>();
        while (last != -1) {
            lis.add(arr[last]);
            last = parent[last];
        }

        Collections.reverse(lis);
        System.out.println(lis);
    }
}
