package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: 1. Two Sum (Optimal Approach)
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/two-sum/
 * Topics: Array, Hash Table
 *
 * Approach: One-Pass Hash Map (Optimal)
 * 1. Maintain a hash map to store each number and its corresponding array index.
 * 2. As we iterate through the array at index 'i':
 *    - Compute the complement required: complement = target - nums[i].
 *    - If the complement already exists in the map, we have found the matching pair:
 *      return new int[] { map.get(complement), i }.
 *    - Otherwise, insert nums[i] and its index 'i' into the map.
 * 3. This reduces the search time of the complement from O(n) to O(1) average lookup.
 *
 * Complexity Analysis:
 * - Time Complexity:  O(n), where 'n' is the number of elements in nums.
 *                     We traverse the list containing 'n' elements only once.
 * - Space Complexity: O(n) auxiliary space.
 *                     The hash map stores up to 'n' elements.
 */
class SolutionOptimal {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
