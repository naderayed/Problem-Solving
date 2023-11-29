package solutions;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Discount {

    public int disc(int[] prices, int discount){
         int total=0;
        Arrays.sort(prices);
        int last = prices.length-1;
        int max = prices[last];
        int disc = max * discount/100;
        prices[last] = prices[last]-disc;
        for(int i : prices)
                total+=i;
        return total;
    }

}
