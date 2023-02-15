package solutions;

public class PalindromeNumber {
    /*
    Description:
    Given an integer x, return true if x is a palindrome, and false otherwise.
    Solution :
    declare an integer to hold the initial value of x, then create another integer to hold the inverse of x.
    while x < 0 , extract x mod 10, then multiply it by 10, finally x/10 to move for the next value and so on ...
    return realX == inverseX result
    Link:https://leetcode.com/problems/palindrome-number/
    Complexity:
    O(n)
     */


    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long realX = x;
        long inverseX = 0;
        while (x > 0) {
            inverseX += x % 10;
            inverseX *= 10;
            x = x / 10;
        }
        inverseX = inverseX / 10;
        return realX == inverseX;
    }
}
