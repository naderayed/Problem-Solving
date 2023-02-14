package solutions;

import java.util.*;

public class GroupAnagrams {

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
}
