import java.util.*;

public class Solution {

    //Contains Duplicate
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
     Link:https://leetcode.com/problems/valid-anagram/
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

    //Group Anagrams
    /*
    Description:
    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.
    solution:
    to solve this problem w should think first to find the groups of anagram by sorting every
    single string and store them into a list,as a result we will get a groups of Anagrams,
    first of all  create a map that will be the dataStructure which store the lists as a value
    and about the Key it will be a reference string that will be used to put the anagrams together
    finally as a return just take the map values and store them into an ArrayList.
    Link:https://leetcode.com/problems/group-anagrams/
    Complexity : O(n)

     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String key = String.valueOf(a);
            map.computeIfAbsent(key, s -> new ArrayList<>()).add(str);

        }
        return new ArrayList<>(map.values());
    }

    //Product Of Array Except Self
    /*
   Description:
   Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    You must write an algorithm that runs in O(n) time and without using the division operation.
    Link:https://leetcode.com/problems/product-of-array-except-self/
    Solution:

     */
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer,1);
        int postFix =1;
        int preFix =1;
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
            answer[i]=preFix;
            preFix*=nums[i];
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            answer[i]*=postFix;
            postFix*=nums[i];
        }

        return answer;
    }
}
