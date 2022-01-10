package D20220110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies
 */
public class Q1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = Arrays.stream(candies).max().orElse(0);

        for(int candy : candies) {
           if(candy + extraCandies >= max) result.add(true);
           else result.add(false);
        }

        return result;
    }
}
