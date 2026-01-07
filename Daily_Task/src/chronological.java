
/*Question 1: The Chronological Librarian
 In the depths of the Great Library of Alexandria, a clumsy apprentice has knocked over a stack of
 N ancient scrolls. Each scroll bears a unique "Chronos ID" integer representing its historical era.
 The Head Librarian, a stern figure, demands the scrolls be placed onto the Great Shelf. However,
 the shelf has a magical constraint: it accepts scrolls only if their Chronos IDs are in strictly
 increasing order from left to right.
 The apprentice cannot rearrange the pile on the floor. They must pick scrolls from the top of the
 stack one by one. For each scroll, they have two choices: place it on the shelf (if it fits the
 increasing order) or discard it into the "Restoration Bin" to be dealt with next century. Once
 placed, a scroll cannot be moved. The apprentice wants to maximize the number of scrolls placed
 on the shelf immediately to minimize their punishment.
 Formal Statement
 Given an integer array A of size N, find the length of the longest strictly increasing subsequence.
 Input/Output Format
 ● Input:
 ○ The first line contains an integer N (1 <= N <= 10^5).
 ○ The second line contains N space-separated integers representing the Chronos IDs
 (1 <= A[i] <= 10^9).
 ● Output:
 ○ A single integer representing the maximum number of scrolls.
 Test Cases
 Case Type Input Output
 Sample 1 6 10 9 2 5 3 7 3
 Sample 2 6 0 1 0 3 2 3 4
 Edge Case 5 7 7 7 7 7 1
 Scale Test N=10^5, increasing 10^5*/

import java.util.*;

public class chronological {

    // Function to find the length of the Longest Increasing Subsequence (LIS)
    public static int findLISLength(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        List<Integer> tails = new ArrayList<>();
        for (int num : arr) {
            if (tails.isEmpty() || num > tails.get(tails.size() - 1)) {
                tails.add(num);
            } else {
                // If not, we find the first element in 'tails' that is >= num.
                // This element is then replaced by 'num', effectively
                // creating a "better" (smaller ending) subsequence of the same length.
                int i = Collections.binarySearch(tails, num);
                if (i < 0) {
                    i = -(i + 1); // Get the insertion point
                }
                tails.set(i, num);
            }
        }

        return tails.size();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Printing Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();

        System.out.println("Length of the Longest Increasing Subsequence: " + findLISLength(arr));
        sc.close();
    }
}
