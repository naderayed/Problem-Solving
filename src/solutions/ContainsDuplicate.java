package solutions;

import java.util.HashSet;

public class ContainsDuplicate {


    /*
        Description :
        Check if there are duplicate elements (int) on an array nums.
        To solve this problem, I use the Set interface, which doesn't accept duplicates.
        So as a result, we add a duplicate element to the set.
        the size of the set will be different from the size of the array.
        Link:https://leetcode.com/problems/contains-duplicate/
        Complexity O(n)
        */
    public boolean containsDuplicate(int[] nums) {
        java.util.Set<Integer> numbers = new HashSet<>();
        for (int number : nums) {
            numbers.add(number);
        }
        return numbers.size() != nums.length;
    }
}
