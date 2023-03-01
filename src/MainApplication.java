import solutions.DefangingAnIPAddress;
import solutions.SearchA2dMatrix;

public class MainApplication {

    public static void main(String[] args) {
        //TODO Test Here!!
        var test = new SearchA2dMatrix();
        int[][] mat = {{1,3,5,7},{10, 11, 16, 20},{23,30,34,60}};
        System.out.println(test.searchMatrix(mat,3));
    }
}
