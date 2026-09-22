/**
 * Problem: 9. Palindrome Number
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/palindrome-number/
 * Topics: Math
 *
 * Approach: Mathematical Digit Reversal
 * 1. Base check:
 *    - All negative numbers cannot be palindromes (e.g., -121 reversed is 121-).
 * 2. Reconstruct the reversed integer:
 *    - Extract digits from right to left using modulo (x % 10).
 *    - Append the digit to 'sum' by shifting previous digits by one decimal place (sum * 10 + digit).
 *    - Divide 'x' by 10 in each iteration until x becomes 0.
 * 3. Verify palindrome:
 *    - Compare the original number with the reconstructed 'sum'.
 *    - Return true if they match, false otherwise.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(log10(n)), where 'n' is the input number.
 *                     The number of iterations equals the number of decimal digits in x.
 * - Space Complexity: O(1) auxiliary space.
 *                     Reversal is computed using constant extra space without String conversion.
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int num = x;
        long sum = 0;
        while (x > 0) {
            sum = (sum * 10) + (x % 10);
            x = x / 10;
        }
        return num == sum;
    }
}