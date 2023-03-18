package solutions;

public class SearchInsertPosition {

    /*
    Description:
    Given a sorted array of distinct integers and a target value,
    return the index if the target is found. If not,
     return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity
    Solution: here I used binary Search algo tho find the index of the target
    on other hand if the target greater than the last element I return tab size as the last index
    which represent a potential index if less that the very first element I return
    0 as a potential index, otherwise I travers the table until I found
    the very superior element and return the index just after it  .
    Link:https://leetcode.com/problems/search-insert-position
    Complexity:O (log n)
     */
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int current = 0;
        while(first <= last){
            current=(first+last)/2;
            if(target == nums[current])
                return current;

            if(target <nums[current])
                last = current -1;

            else first =current+1;
        }
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        if(nums[0]>target){
            return 0;
        }
        int i = 0;
        while (target >= nums[i] && i < nums.length-1) {
            i++;
        }
        return i;
    }
}
