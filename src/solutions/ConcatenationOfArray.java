package solutions;

public class ConcatenationOfArray {

    /*
    Description:
    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    Specifically, ans is the concatenation of two nums arrays.
    Return the array ans.
    Solution : as simple as that just look the code
    Link:https://leetcode.com/problems/concatenation-of-array/

     */
    public int[] getConcatenation(int[] nums) {
        int [] tab = new int[nums.length*2];

        for(int i=0; i<nums.length;i++){
            tab[i]=nums[i];
            tab[i+nums.length]=nums[i];
        }
        return tab;

    }
}
