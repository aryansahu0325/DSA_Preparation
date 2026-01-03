import java.util.*;

public class st66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        char need = 'a';

        for (int i = 0; i < s.length && need <= 'z'; i++) {
            if (s[i] <= need) {
                // Increase s[i] to exactly what we need
                s[i] = need;
                need++;
            }
        }

        // If we couldn't reach 'z', impossible
        if (need <= 'z') {
            System.out.println(-1);
        } else {
            System.out.println(new String(s));
        }
    }
}
