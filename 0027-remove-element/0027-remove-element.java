/**
 * Problem: 27. Remove Element
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/remove-element/
 * Topics: Array, Two Pointers
 *
 * Approach: Two Pointers (In-Place Filter)
 * 1. Initialize a write pointer (k = 0):
 *    - The pointer 'k' keeps track of the next valid index where a non-target value should be placed,
 *      while also serving as the running count of valid elements.
 * 2. Scan the array with an iterator pointer (i):
 *    - Traverse each element nums[i] across the array from index 0 to n - 1.
 * 3. Filter and overwrite:
 *    - If nums[i] != val:
 *        The current element is valid and must be retained.
 *        Copy it forward to the write position (nums[k] = nums[i]) and advance the pointer (k++).
 *    - If nums[i] == val:
 *        The element matches the target to be removed.
 *        Do nothing and let 'i' advance, effectively skipping and discarding it.
 * 4. Return result:
 *    - After the traversal finishes, return 'k', which represents the total number of elements
 *      that are not equal to 'val'.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(n), where 'n' is the length of nums.
 *                     The array is scanned in a single linear pass.
 * - Space Complexity: O(1) auxiliary space.
 *                     The operation is performed entirely in-place without extra memory allocation.
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}