import java.util.*;

public class cargo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of containers");
        int n = sc.nextInt();          // number of envelopes
        int[][] env = new int[n][2];
        System.out.println("Enter width and height");
        for (int i = 0; i < n; i++) {
            env[i][0] = sc.nextInt();  // width
            env[i][1] = sc.nextInt();  // height
        }

        Arrays.sort(env, (a, b) ->
                a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );

        int[] dp = new int[n];
        int len = 0;

        for (int i = 0; i < n; i++) {
            int h = env[i][1];
            int idx = Arrays.binarySearch(dp, 0, len, h);
            if (idx < 0) idx = -(idx + 1);
            dp[idx] = h;
            if (idx == len) len++;
        }

        System.out.println("Maximum number of envelope"+len); // maximum nesting depth
    }
}

/*Question 3: The Matryoshka Cargo
InterGalactic Shipping Co. utilizes a unique storage technology. Standard cargo containers are
rectangular prisms with dimensions (Width, Height). To optimize cargo hold usage, containers are
"nested" like Russian Matryoshka dolls. A container A can be placed inside container B if and only
if: both its width and height are strictly less than the width and height of B.
Containers cannot be rotated (gravity plating prevents it). You are the Loading Master. Given a
manifest of arriving containers, determine the maximum number of containers that can be
nested into a single stack.
Formal Statement
Given a 2D array envelopes where envelopes[i] = [wi, hi], return the maximum number of
envelopes that can be nested.
Input/Output Format
Input:
1 <= envelopes.length <= 105
envelopes[i].length == 2
1 <= wi, hi <= 105
● Output: Integer representing the maximum nesting depth.
Test Cases
Case Type Input Output Explanation
Sample 1 [[5 4] ,[6 4], [6 7], [2 3]] 3
Trap Case [[1 10], [1 5], [1 2]] 1 All widths equal. None
fit inside others*/