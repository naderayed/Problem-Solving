package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestToZero {


    public int zero(int[] tab){
        List<Integer> posInt = new ArrayList<>();
        List<Integer> negativeInt = new ArrayList<>();

        for (int i : tab ){
            if(i < 0){
                negativeInt.add(i);
            }
            else if (i >=0){
                posInt.add(i);
            }

        }
        Collections.sort(negativeInt);
        int closestPos=  posInt.get(0);
        int closestNeg=  negativeInt.get(negativeInt.size()-1);
        if(closestNeg+closestPos==0){
            return closestPos;
        }
        else if(closestNeg*(-1) < closestPos){
            return closestNeg;
        }
        else return closestPos;
    }
}
