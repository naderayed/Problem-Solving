package solutions;

public class JewelsAndStones {
     /*
     You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
     Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
        Letters are case-sensitive, so "a" is considered a different type of stone from "A".
       Example 1:
       Input: jewels = "aA", stones = "aAAbbbb"
       Output: 3

       Solution :
       First I have to loop throw the two sting to do that I must cast the string to an Array of char, to Do that I will use the
       str.toCharArray() method, since the letters are case-sensitive once again I have to cast the char to an int in order to compare
       the code ascii of the letters.
*/
     public int numJewelsInStones(String jewels, String stones) {
         int totalDiffStones =0;
         char[] jewelsTab = jewels.toCharArray();
         char[] stonesTab = stones.toCharArray();
         for(int j : jewelsTab){
             for(int s : stonesTab){
                 if(j == s){
                     totalDiffStones ++;
                 }
             }
         }
         return totalDiffStones;
     }
}
