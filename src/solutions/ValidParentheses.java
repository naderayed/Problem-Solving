package solutions;

import java.util.Stack;

public class ValidParentheses {

    /*
    Description:
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
     */

    public boolean isValid(String s) {

        if(s.length()<2)
            return false;
        Stack<Character> underTest =  new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray){
            underTest.push(c);
        }
          int i =-1;
          int j =underTest.size();

          while (i < j){
              i++;
              j--;
              System.out.println(i+"  "+j);
          }
        return true;
}
}
