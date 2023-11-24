package solutions;

public class SortColors {
    /*
        Given an array nums with n objects colored red, white, or blue,
        sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white,
         and blue.
        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
        You must solve this problem without using the library's sort function.

        Example 1:

        Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]
        Link : https://leetcode.com/problems/sort-colors/
        Solution:
        simple bubble sort algorithm
     */
    public void sortColors(int[] nums) {
        int holder = 0;
        for (int i =  0 ; i < nums.length-1; i++){
            for (int j = i+1 ; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    holder=nums[i];
                    nums[i]= nums[j];
                    nums[j] = holder;
                }
            }
        }
    }
}
