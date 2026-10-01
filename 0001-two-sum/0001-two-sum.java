/**
 * Problem: 1. Two Sum
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/two-sum/
 * Topics: Array, Hash Table
 *
 * Approach: Brute Force (Nested Loop Pair Checking)
 * 1. Iterate through each element with an outer pointer 'i' from index 0 to n - 1.
 * 2. For each element, iterate with an inner pointer 'j' starting from i + 1 to n - 1.
 * 3. Check if nums[i] + nums[j] == target:
 *    - If a match is found, immediately return new int[] { i, j }.
 * 4. If no valid pair is found, return an empty array.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(n^2), where 'n' is the length of nums.
 *                     In the worst case, checks n * (n - 1) / 2 pairs.
 * - Space Complexity: O(1) auxiliary space.
 *                     Does not allocate extra data structures.
 *
 * Optimal Follow-up Note:
 * - Can be optimized to O(n) Time using a HashMap to store (complement -> index).
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }
}