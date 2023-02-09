import java.util.*;

public class Solution {

    //Contains Duplicate
    /*
    Description :
    Check if there are duplicate elements (int) on an array nums.
    To solve this problem, I use the Set interface, which doesn't accept duplicates.
    So as a result, we add a duplicate element to the set.
    the size of the set will be different from the size of the array.
    Complexity O(n)
    */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int number : nums) {
            numbers.add(number);
        }
        return numbers.size() != nums.length;
    }

    //Valid Anagram
    /*
    Description:
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.
    Solution:
     First, if the length of the two strings is not equal, return false.
    Otherwise, transform the strings into arrays of char,
    Then create two maps where the key is the different char of the string
     and the value is the number of occurrences,
     finally compare the number of occurrences of the char if not equal return false otherwise return true
     Complexity: O(n)
     Less complex solution, after transforming the strings into arrays
      just sort them and return Arrays.equals result
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> mapt = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : chart) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }
        for (char c : chars) {
            if (!Objects.equals(map.get(c), mapt.get(c)))
                return false;
        }
        return true;

        //Best Solution
        /*
        if (s.length() != t.length())
        return false;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        return Arrays.equals(chart, chars);
        */
    }

    //Two Sum
    /*
    Description:
        Given an array of integers nums and an integer target,
     return indices of the two numbers such that they add up to target.
     You may assume that each input would have exactly one solution,
     and you may not use the same element twice.You can return the answer in any order.
     Solution:
     create a Map with Integer for both  key and value,
     the map will hold as a key the actual element of nums, and as a value the index of element in nums
     if we found key = target - the current element if nums,
     then return nums's index and the other index from the map (value of target -nums[i]
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res =new int[2];
        Map<Integer,Integer> map= new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
