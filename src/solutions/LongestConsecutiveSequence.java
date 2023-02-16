package solutions;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    /*
    Description:
    Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    You must write an algorithm that runs in O(n) time.
    Solution:
    first we take care of empty array by returning 0,then declare a Map with each value of the array as a key
     and Boolean value indicate the current val can be the initial start of our longest consecutive sequence
     then loop the array and select the maybe start value , at the end check if the map contains +1 current val
     if the case increment tempLength and compare it with the maxLength at the end return it .
    Link:https://leetcode.com/problems/longest-consecutive-sequence/description/
    */
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashMap<Integer, Boolean> map = new HashMap<>();

        int maxLength = 1;
        int tempLength = 1;

        for (Integer val : nums) map.put(val, true);

        for (Integer val : nums) {
            if (map.containsKey(val - 1)) map.put(val, false);
        }

        for (Integer val : nums) {
            if (map.get(val)) {
                int temp = val;
                while (map.containsKey(++temp)) tempLength++;
                if (tempLength > maxLength) {
                    maxLength = tempLength;
                }
                tempLength = 1;
            }
        }

        return maxLength;
        //Out of Time Solution complexity more then O(n)
//        boolean sorted=false;
//     while(!sorted){
//         sorted=true;
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i]>nums[i+1]){
//                max=nums[i];
//                nums[i]=nums[i+1];
//                nums[i+1]=max;
//                sorted=false;
//            }
//        }}
//            System.out.println(Arrays.toString(nums));
//            for (int j = 0; j < nums.length-1; j++) {
//                if(nums[j+1]-nums[j]==1 || nums[j+1] == nums[j] ){
//                    count++;
//                }else break;
//
//            }

    }
}
