package solutions;

public class ValidPalindrome {

    /*Description:
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
    Solution : first of all i used ASCCI code in order to filter the letters and numbers ,
    then i used two pointer approach to compare the fist++ and last-- char
    in order to determinate if it is a valid palindrome or not
    Link:https://leetcode.com/problems/valid-palindrome/
    */

    /*
    easy solution from leetCode , so easy and hard to find
          public boolean isPalindrome(String s) {
        String tmp = s.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~ ]", "").toLowerCase();
        return tmp.equals(new StringBuilder(tmp).reverse().toString());
    }
    */
    public boolean isPalindrome(String s) {

        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        String toPala ="";

        for (int c : chars){
            if (c>96 && c<123 || c>47 && c<58)
                toPala+=(char)c;
        }
        char[] chars1 = toPala.toCharArray();
        int first =0;
        int last= chars1.length-1;
        System.out.println(toPala);
        while(first<=last){
            if(chars1[first]==chars1[last]){
                first++;
                last--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
