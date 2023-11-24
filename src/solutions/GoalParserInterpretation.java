package solutions;

public class GoalParserInterpretation {

    /*
    You own a Goal Parser that can interpret a string command.
    The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
     The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
     The interpreted strings are then concatenated in the original order.
    Given the string command, return the Goal Parser's interpretation of command.

        Example 1:
        Input: command = "G()(al)"
        Output: "Goal"
        Explanation: The Goal Parser interprets the command as follows:
        G -> G
        () -> o
        (al) -> al
        The final concatenated result is "Goal".

     link : https://leetcode.com/problems/goal-parser-interpretation

     Solution :
     first declare a StringBuilder to reduce memory usage ; after that loop throw the command if the letter i G append it to the string
     that will be returned  and increment the i by 1, else if the letter and the next letter  equal to ()
     append 'o' and increment i by 2, else append "al" and increment i by 4;

         */
    public String interpret(String command) {
        StringBuilder returnVar = new  StringBuilder();
        for(int i =0 ; i< command.length() ;){
            if(command.charAt(i)== 'G'){
                returnVar.append("G");
                i=i+1;
            }
            else if(command.charAt(i)== '(' && command.charAt(i+1)==')'){
                returnVar.append("o");
                i=i+2;
            }
            else {
                returnVar.append("al");
                i=i+4;
            }

        }
        return returnVar.toString();
    }
}
