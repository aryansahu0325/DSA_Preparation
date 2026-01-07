/*Question 2: The Cursed Hotel Rooms
The "Grand Enigma Hotel" is undergoing a massive renovation. The hotel has floors numbered
from 1 up to a very large number N. However, the hotel owner is deeply superstitious. They
believe the digit '4' brings death. Furthermore, due to a past structural failure involving rooms
ending in '7' on the 10th floor, the sequence of digits "17" is strictly forbidden anywhere in the
room number.
You are the Chief Numbering Officer. You must calculate exactly how many valid room numbers
exist in the range $$. A room number is valid if it contains no digit '4' and no substring "17".
Formal Statement
Count the number of integers x such that L <= x <= R, x does not contain the digit '4', and x does
not contain the substring "17".
Input/Output Format
● Input: Two space-separated integers L and R (1 <= L <= R <= 10^{18}).
● Output: The count of valid integers.
Test Cases
Case Type Input Output Explanation
Sample 1 1 20 17 Exclude 4, 14, 17. Total
20 - 3 = 17.
Sample 2 100 200 ?
Edge Case 4 4 0 Range contains only an
invalid number.*/

import java.util.*;

public class Cursed_Hotel {

    static long[][][][] dp;
    static char[] digits;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower boundary");
        long L = sc.nextLong();
        System.out.println("Enter the upper boundary");
        long R = sc.nextLong();
        System.out.println(countValid(R) - countValid(L - 1)-1);
    }

    static long countValid(long n) {
        if (n < 0) return 0;

        digits = Long.toString(n).toCharArray();
        dp = new long[digits.length][2][2][2];

        for (long[][][] a : dp)
            for (long[][] b : a)
                for (long[] c : b)
                    Arrays.fill(c, -1);

        return solve(0, 1, 0, 0);
    }

    static long solve(int pos, int tight, int prevOne, int started) {
        if (pos == digits.length) {
            return started == 1 ? 1 : 0;
        }

        if (dp[pos][tight][prevOne][started] != -1)
            return dp[pos][tight][prevOne][started];

        long res = 0;
        int limit = tight == 1 ? digits[pos] - '0' : 9;

        for (int d = 0; d <= limit; d++) {

            int newTight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 1) {
                if (d == 4) continue;
                if (prevOne == 1 && d == 7) continue;
            }

            int newStarted = (started == 1 || d != 0) ? 1 : 0;
            int newPrevOne = (newStarted == 1 && d == 1) ? 1 : 0;

            res += solve(pos + 1, newTight, newPrevOne, newStarted);
        }

        return dp[pos][tight][prevOne][started] = res;
    }
}
