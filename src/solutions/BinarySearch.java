package solutions;

import java.util.Arrays;

public class BinarySearch {

    /*
    Description:
    Given an array of integers nums which is sorted in ascending order, and an integer target,
    write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.
    Solution: To solve this problem I use two pointers, first takes the first index and last takes the last index.
    Then each time we check if the middle element is equal to or less then the target.
    if == returns the current index, if greater that means our target is on the left, so we move our last to the middle -1
    if < that means our target is on the right, so we move our first to the middle +1, and so on until we get
    our target or the two pointers cross.
    Link:https://leetcode.com/problems/binary-search/description/
    Complexity: O(log n)

        */

    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length -1 ;
        int current=0;
        while(first <= last){
            current=(first+last)/2;
            if(target == nums[current])
                return current;

            if(target <nums[current])
                last = current -1;

            else first =current+1;
        }
        return -1;
    }
}
