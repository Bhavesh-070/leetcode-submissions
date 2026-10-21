/**
 * Problem: 3512. Minimum Operations to Make Array Sum Divisible by K
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/
 * Topics: Array, Math
 *
 * Approach: Modulo Arithmetic on Total Sum
 * 1. Each operation decreases an element by 1, which reduces the total sum of the array by 1.
 * 2. To make the total sum divisible by 'k', we must reduce it to the nearest multiple of 'k' <= sum.
 * 3. The minimum number of decrements needed is simply the remainder: sum % k.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(n), where 'n' is the length of nums.
 *                     Traverses the array once to calculate the sum.
 * - Space Complexity: O(1) auxiliary space. Uses constant memory.
 */
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % k;
    }
}