import solutions.LetterCombinationsOfaPhoneNumber;
import solutions.SearchInsertPosition;
import solutions.SquaresOfASortedArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApplication {

    public static void main(String[] args) {
        //TODO Test Here!!
        SquaresOfASortedArray squares= new SquaresOfASortedArray();

        int[] tab = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(squares.sortedSquares(tab)));

    }
}
