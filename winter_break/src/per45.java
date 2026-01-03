import java.util.*;

public class per45 {

    static class Perm {
        Set<Integer> used = new HashSet<>();
        int max = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        List<Perm> perms = new ArrayList<>();
        int[] belong = new int[n];

        for (int i = 0; i < n; i++) {
            int x = a[i];
            boolean placed = false;

            // try to place in existing permutations
            for (int j = 0; j < perms.size(); j++) {
                Perm p = perms.get(j);

                if (!p.used.contains(x) && p.used.size() < Math.max(p.max, x)) {
                    p.used.add(x);
                    p.max = Math.max(p.max, x);
                    belong[i] = j + 1;
                    placed = true;
                    break;
                }
            }

            // create new permutation
            if (!placed) {
                Perm p = new Perm();
                p.used.add(x);
                p.max = x;
                perms.add(p);
                belong[i] = perms.size();
            }
        }

        // validate permutations
        for (Perm p : perms) {
            if (p.used.size() != p.max) {
                System.out.println(-1);
                return;
            }
            for (int i = 1; i <= p.max; i++) {
                if (!p.used.contains(i)) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        // output
        System.out.println(perms.size());
        for (int i = 0; i < n; i++) {
            System.out.print(belong[i] + " ");
        }
    }
}
