import java.util.*;

public class cs44 {

    static List<String> result = new ArrayList<>();

    static void backtrack(char[] chars, boolean[] used, StringBuilder current) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;

            // Skip duplicate characters
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.append(chars[i]);

            backtrack(chars, used, current);

            // backtrack
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] chars = s.toCharArray();
        Arrays.sort(chars); // Important for lexicographical order

        boolean[] used = new boolean[chars.length];
        backtrack(chars, used, new StringBuilder());

        // Output
        System.out.println(result.size());
        for (String str : result) {
            System.out.println(str);
        }
    }
}
