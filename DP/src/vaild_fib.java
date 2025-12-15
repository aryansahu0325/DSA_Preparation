import java.io.*;
import java.util.*;

public class vaild_fib {

    static FastScanner sc = new FastScanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    private static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long count = 0;

        for (long i = 0; i <= n; i++) {

            boolean isValid = true;
            long second = n;   // kth term
            long first = i;    // (k-1)th term

            for (long j = k - 2; j >= 1; j--) {
                long newE = second - first;

                if (newE < 0) {
                    isValid = false;
                    break;
                }
                else if (newE > first) {
                    isValid = false;
                    break;
                }
                else {
                    // update sequence
                    second = first;
                    first = newE;
                }
            }

            if (isValid) {
                count++;
            }
        }

        System.out.println(count);
    }


    // Fast Scanner using InputStream + StringTokenizer
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
//import java.util.Scanner;
//
//public class fibb {
//    public static void main(String[] args) {
//        long t;
//        Scanner sc = new Scanner(System.in);
//        t = sc.nextLong();
//        while (t-- > 0) {
//            solve();
//        }
//    }
//
//
//    private static void solve() {
//        Scanner sc = new Scanner(System.in);
//           long n = sc.nextLong();
//           long k = sc.nextLong();
//           long count =0;
//            for (long i = 0; i <= n; i++) {
//                boolean isValid = true;
//                long second = n;  // kth
//                long first = i;  // k-1th term
//                for (long j = k - 2; j >= 1; j--) {
//                    long newE = second - first;
//                    // newE is  smaller then first
//                    if ((newE > first)) {
//                        isValid = false;
//                        break;
//                    }
//                    // if newE is  negative
//                    if (newE < 0) {
//                        isValid = false;
//                        break;
//                    }
//                    second = first;
//                    first = newE;
//                }
//                if (isValid == true) {
//                    count++;
//                }
//
//
//            }
//            System.out.println(count);
//        }
//
//}