package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfaPhoneNumber {

    /*
    Description: Given a string containing digits from 2-9 inclusive,
     return all possible letter combinations that the number could represent.
     Return the answer in any order.
    A mapping of digits to letters (just like on the telephone buttons) is given below.
    Note that 1 does not map to any letters.
     */


    public List<String> letterCombinations(String digits) {

        List<String> returnList = new ArrayList<>();

        Map<Character, String> keyBoard = new HashMap<>();
        keyBoard.put('2', "abc");
        keyBoard.put('3', "def");
        keyBoard.put('4', "ghi");
        keyBoard.put('5', "jkl");
        keyBoard.put('6', "mno");
        keyBoard.put('7', "pqrs");
        keyBoard.put('8', "tuv");
        keyBoard.put('9', "wxyz");
        if (digits.length() == 1) {
            String s = keyBoard.get(digits.charAt(0));
            for (int i = 0; i < s.length(); i++) {
                returnList.add(Character.toString(s.charAt(i)));
            }
            return returnList;
        }
        char[] inputArray = digits.toCharArray();
        int first = 0;
        int last = inputArray.length - 1;
        String s = "";
        String fString = "";
        String lString = "";
        while (first < last) {
            fString = keyBoard.get(inputArray[first]);
            lString = keyBoard.get(inputArray[last]);
            for (int i = 0; i < fString.length(); i++) {
                for (int j = 0; j < lString.length(); j++) {
                    s += fString.charAt(i);
                    s += lString.charAt(j);
                    returnList.add(s);
                    s = "";

                }


            }
            last--;
        }

        return returnList;
    }
}
