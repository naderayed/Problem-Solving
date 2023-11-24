package solutions;

import java.util.TreeSet;

public class MaximumNumberOfWordsFoundInSentences {
    /*
     A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
    You are given an array of strings sentences, where each sentences[i] represents a single sentence.
    Return the maximum number of words that appear in a single sentence.
    Link: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences
    Solution: i am going to use TreeSet to store the number of words in each sentence. Since Set does not accept
    duplication and  a TreeSet ensure a sorted order, I will return the last element of the set .

     */

    public int mostWordsFound(String[] sentences) {
        TreeSet<Integer> maxSet = new TreeSet<>();
        int counter;
        for (String s : sentences) {
            counter = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    counter++;
                }
            }
            maxSet.add(counter);
        }
        return maxSet.last();
    }

}
