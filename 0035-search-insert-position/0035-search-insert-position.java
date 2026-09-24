/**
 * Problem: 35. Search Insert Position
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/search-insert-position/
 * Topics: Array, Binary Search
 *
 * Approach: Binary Search
 * 1. Initialize two pointers: 'left = 0' and 'right = nums.length - 1'.
 * 2. While left <= right:
 *    - Calculate mid = left + (right - left) / 2 to prevent integer overflow.
 *    - If nums[mid] == target, return 'mid'.
 *    - If target < nums[mid], narrow search space to the left half (right = mid - 1).
 *    - If target > nums[mid], narrow search space to the right half (left = mid + 1).
 * 3. If target is not found:
 *    - The loop terminates when left > right.
 *    - 'left' points to the exact insertion index that preserves sorted order.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(log n), where 'n' is the length of nums.
 *                     The search range is halved in each step.
 * - Space Complexity: O(1) auxiliary space.
 *                     Iterative binary search uses constant extra memory.
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        // Fast boundary checks: O(1) early exit when target is outside array range
        if (target <= nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}