/**
 * Problem: 66. Plus One
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/plus-one/
 * Topics: Array, Math
 *
 * Approach:
 * - Start from the rightmost digit (least significant digit) and move backwards.
 * - If the current digit is less than 9:
 *     - Increment it by 1 and return the array immediately (no carry left).
 * - If the current digit is 9:
 *     - Set it to 0 and carry 1 to the next significant digit on the left.
 * - Edge Case (All digits are 9, e.g., 999 -> 1000):
 *     - If the loop finishes without returning, all digits were 9 and became 0.
 *     - Allocate a new array of length (n + 1). In Java, integer arrays default to 0.
 *     - Set the first element result[0] = 1 and return the new array.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(n), where 'n' is the length of the digits array.
 *                     In the worst case (e.g., 999), we traverse all n digits once.
 * - Space Complexity: O(1) auxiliary space in best/average cases (in-place modification).
 *                     O(n) auxiliary space only in the worst-case scenario when all digits are 9.
 */
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // Handles edge case where all digits are 9 (e.g., [9, 9, 9] -> [1, 0, 0, 0])
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}