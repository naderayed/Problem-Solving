package solutions;

public class TwoSumiiInputArrayIsSorted {

    /*
    Description:Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
     find two numbers such that they add up to a specific target number.
     Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
    Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
    The tests are generated such that there is exactly one solution. You may not use the same element twice.
    Your solution must use only constant extra space.
    Solution: i used two pointer approach the  first at 0 and the last at last element ,
    while the sum of the two element anot equal the target do a test if the target is bigger than
     the sum we have to move the smallest element to the next ( > current) ,
     if the  target small than sum we have to move the last to the lowes value last -- , until we find
     sum == target , eventually return {fist +1 ,last +1}
     Link:https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
     Complexity= O(n)
    */
    public int[] twoSum(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        while (nums[l] + nums[r] != target) {
            if (nums[l] + nums[r] < target) l++;
            else r--;
        }
        return new int[]{l + 1, r + 1};
    }
}
