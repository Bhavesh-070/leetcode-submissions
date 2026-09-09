package leetcode.p0001;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum (Easy)
 * https://leetcode.com/problems/two-sum/
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Solution {
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
