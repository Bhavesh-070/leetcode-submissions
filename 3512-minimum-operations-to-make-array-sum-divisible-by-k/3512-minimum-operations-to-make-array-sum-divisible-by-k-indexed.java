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

/*
 * ============================================================================
 * 🧠 QUICK REVISION NOTES (Read before interviews)
 * ============================================================================
 * 
 * 1. Problem Understanding:
 *    - Given an array 'nums' and an integer 'k'.
 *    - In one operation, we can decrease any element by 1 (nums[i] - 1).
 *    - Find the MINIMUM operations so that total array sum is divisible by k.
 *
 * 2. Key Observation & Intuition:
 *    - Decreasing any single element by 1 decreases the TOTAL sum by exactly 1.
 *    - Any sum S can be written as: S = (q * k) + remainder (where remainder = S % k).
 *    - To make S divisible by k with minimum decrements, we just strip away the
 *      extra remainder: (S - remainder) is guaranteed to be divisible by k!
 *    - Formula: minimum operations = sum % k.
 *
 * 3. Dry Run Example:
 *    - nums = [3, 9, 7], k = 5
 *    - Sum = 3 + 9 + 7 = 19
 *    - Remainder = 19 % 5 = 4
 *    - 19 - 4 = 15 (which is 15 % 5 == 0, divisible by 5).
 *    - Total operations needed = 4.
 *
 * 4. Important Gotcha:
 *    - The sum DOES NOT need to become 0! It only needs to become a multiple of k.
 *    - 15 is divisible by 5, so we stop at 15 instead of decreasing all the way to 0.
 *
 * 5. 30-Second Rule:
 *    Calculate Sum -> Find Remainder (sum % k) -> Return Remainder.
 * ============================================================================
 */
