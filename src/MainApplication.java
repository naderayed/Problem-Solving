import solutions.SelectionSort;
import solutions.Student;

import java.lang.reflect.Field;
import java.util.Arrays;

public class MainApplication {

    public static void main(String[] args) throws IllegalAccessException {

      var s = new SelectionSort();
      int[] tab = {5,4,8,9,6,3,2,1};
        System.out.println(Arrays.toString(s.selectSort(tab)));
    }
}
