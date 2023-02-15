package solutions;

import java.util.Arrays;

public class LongestCommonPrefix {

    /*
    Description:
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
    Solution:so at first we check if the array not empty if the case return "", otherwise we have to sort the
    Array to make sure that we place the most different string as last String,
    then we check every char of the last and the first meanwhile keeping the count on,if two char at the same index didn't
    match break the loop and keep the index of the last matching ...
    Link:https://leetcode.com/problems/longest-common-prefix/
    Complexity: O(nlog(n))
    */

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String answer = "";
        Arrays.sort(strs);
        int count = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        while (count < strs.length) {
            if (first.charAt(count) == last.charAt(count)) {
                count++;
            } else break;
        }

        return count == 0 ? "" : first.substring(0, count);
    }
}
