package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

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
}
