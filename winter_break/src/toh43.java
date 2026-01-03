import java.util.*;

public class toh43 {

    static StringBuilder sb = new StringBuilder();

    static void hanoi(int n, int from, int aux, int to) {
        if (n == 0) return;

        // Move n-1 disks from source to auxiliary
        hanoi(n - 1, from, to, aux);

        // Move largest disk to destination
        sb.append(from).append(" ").append(to).append("\n");

        // Move n-1 disks from auxiliary to destination
        hanoi(n - 1, aux, from, to);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Minimum number of moves = 2^n - 1
        long moves = (1L << n) - 1;
        System.out.println(moves);

        // Generate and print moves
        hanoi(n, 1, 2, 3);
        System.out.print(sb.toString());
    }
}
