/**
 * Problem: 3512. Minimum Operations to Make Array Sum Divisible by K (Approach 1: Standard Indexed Loop)
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/
 * Topics: Array, Math
 *
 * Approach: Standard Indexed For-Loop
 * 1. Accumulate total sum by accessing each element using standard array indexing nums[i].
 * 2. Return the remainder (sum % k), representing the minimum operations needed.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(n), where 'n' is the length of nums.
 * - Space Complexity: O(1) auxiliary space.
 */
class SolutionIndexed {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum % k;
    }
}
