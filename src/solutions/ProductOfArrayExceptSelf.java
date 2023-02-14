package solutions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    /*
        Description:
        Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
        You must write an algorithm that runs in O(n) time and without using the division operation.
        Link:https://leetcode.com/problems/product-of-array-except-self/
        Solution:
        check NeetCode explanation
        Complexity:
        O(n)
 */
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);
        int postFix = 1;
        int preFix = 1;
        //O(n²) solution
 /* for (int i = 0; i < answer.length; i++) {
            coif=1;
            for (int j = 0; j < nums.length ; j++) {
                if(j!=i){
                    coif*=nums[j];
                }
            }
            answer[i]=coif;
        }*/
        //after watching NeetCode explanation
        for (int i = 0; i < nums.length; i++) {
            answer[i] = preFix;
            preFix *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= postFix;
            postFix *= nums[i];
        }

        return answer;
    }
}
