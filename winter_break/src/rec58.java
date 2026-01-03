import java.util.*;

public class rec58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long min = Math.min(a, b);
            long max = Math.max(a, b);

            if ((a % 2 == 1 && b % 2 == 1) || (min == 1 && max == 2)) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
