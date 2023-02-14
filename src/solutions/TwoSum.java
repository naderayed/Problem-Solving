package solutions;

import java.util.Map;
import java.util.TreeMap;

public class TwoSum {

    /*
    Description:
        Given an array of integers nums and an integer target,
     return indices of the two numbers such that they add up to target.
     You may assume that each input would have exactly one solution,
     and you may not use the same element twice.You can return the answer in any order.
     Solution:
     create a Map with Integer type for both  key and value,
     the map will hold as a key the actual element of nums, and as a value the index of element in nums
     if we found key = target - the current element if nums,
     then return nums's index and the other index from the map (value of target -nums[i]
     Link:https://leetcode.com/problems/two-sum/
     Complexity : O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
