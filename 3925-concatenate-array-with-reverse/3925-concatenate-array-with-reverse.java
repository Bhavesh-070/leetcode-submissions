/**
 * Problem: 3925. Concatenate Array With Reverse
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/concatenate-array-with-reverse/
 * Topics: Array, Simulation
 *
 * Approach: Single-Pass Direct Array Construction
 * 1. Let 'n' be the length of the input array 'nums'.
 * 2. Allocate an answer array 'arr' of size 2 * n.
 * 3. Traverse from index i = 0 to n - 1:
 *    - Copy nums[i] directly into the first half: arr[i] = nums[i].
 *    - Copy the mirrored element into the second half: arr[i + n] = nums[n - i - 1].
 * 4. Return the resulting array 'arr'.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(n), where 'n' is the length of nums.
 *                     Constructs the full 2n-length array in a single traversal of n elements.
 * - Space Complexity: O(n) to store the result array of size 2n (O(1) extra auxiliary space).
 */
class Solution {
    public int[] concatWithReverse(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[n - i - 1];
        }

        return ans;
    }
}