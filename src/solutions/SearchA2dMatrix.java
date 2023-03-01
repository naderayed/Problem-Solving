package solutions;

public class SearchA2dMatrix {
    /*
        Description:You are given an m x n integer matrix  with the following two properties:
        Each row is sorted in non-decreasing order.
        The first integer of each row is greater than the last integer of the previous row.
        Given an integer target, return true if target is in matrix or false otherwise.
        You must write a solution in O(log(m * n)) time complexity.
        Solution: we know that the matrix is ordered so i point one pointer in the very last col
         and check if target less than the value of last col first row that means
         our target is in the previous col  but this solution Time Limit exceeded.
         so i use while loop to reduce complexity by using just one single loop instead of 2 for loop
         as well here i used two pointer approach  the n one point at column 0
          and m point at the very last row of n, after that i checked if target is == the current val
          return true otherwise if target > increment n else or  m--
        Link:https://leetcode.com/problems/search-a-2d-matrix/
        Complexity: O(log(m * n))
     */


    public boolean searchMatrix(int[][] matrix, int target) {

        /*
        Time Limit exceeded Solution
        */
//        for (int i = matrix.length-1; i >=0 ; i--) {
//            for (int j = 0; j < matrix[i].length-1; j++) {
//                if (target == matrix[i][j]){
//                    return true;
//                } else if (target< matrix[i][j]) {
//                    break;
//                }
//            }
//        }
        /* while Solution */
        int n = 0;
        int m = matrix[n].length-1;

        while(n < matrix.length && m>=0){

            if (target == matrix[n][m]){
                return true;
            } else if ((target< matrix[n][m])) {
                m--;
            }
            else n++;
            }
        return false;
    }

}
