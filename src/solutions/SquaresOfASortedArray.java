package solutions;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] returnTab = new int[nums.length];

        int first =0;
        int last = nums.length-1;
        int current= nums.length-1;
        while(first<=last){
            int squareF=nums[first]*nums[first];
            int squareL=nums[last]*nums[last];
            if(squareF>squareL){
                returnTab[current]=squareF;
                first++;
            }else {
                returnTab[current] =squareL;
                last--;

            }
            current--;

        }
//
//        for(int i =0 ; i<nums.length; i++){
//            square = nums[i]*nums[i];
//                returnTab[i]=square;
//        }
//        Arrays.sort(returnTab);
        return returnTab;
    }

}
