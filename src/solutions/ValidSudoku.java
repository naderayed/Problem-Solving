package solutions;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    /*
  Description:
  Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
  Each row must contain the digits 1-9 without repetition.
  Each column must contain the digits 1-9 without repetition.
  Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
  Solution:
  at the first i had the idea of using ArrayList and contains(O obj) to check if the char is found in the row,
  if the case return false else add the char to the ArrayList, at the end of j clear the array and so on,
  but when i tried to check the validity of the boxes i found some problem when trying to limit the 3*3.
  eventually i gave up and try a new solution based on Set when we know that Set does not accept duplicated
  so i fix a pattern of message that store information about every single char and his position
  if the .add(O obj) of any pattern  false that means sudoku not valid as simple as that .
  Link:https://leetcode.com/problems/valid-sudoku/description/
  Complexity :
  O(n²)
  */
    public boolean isValidSudoku(char[][] board) {
        Set<String> setCheck = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!setCheck.add(board[i][j] + "in row " + i)
                            || !setCheck.add(board[i][j] + "in col " + j)
                            || !setCheck.add(board[i][j] + "in blok " + (i / 3) + (j / 3))
                    ) {
                        return false;
                    }
                }
            }


        }

        return false;
    }
}
