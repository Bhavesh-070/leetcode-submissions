/**
 * Problem: 26. Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Approach:
 * - Two Pointers technique (Slow & Fast Pointer).
 * - The slow pointer 'k' keeps track of the index of the last unique element found.
 * - The fast pointer 'i' iterates through the array from index 1 to n - 1.
 * - Whenever nums[i] != nums[k], increment 'k' and copy nums[i] to nums[k].
 * - Return k + 1, which represents the number of unique elements.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(n), where 'n' is the length of the array.
 *                     We traverse the array in a single pass.
 * - Space Complexity: O(1) auxiliary space.
 *                     The modification is performed in-place with no extra memory allocation.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}