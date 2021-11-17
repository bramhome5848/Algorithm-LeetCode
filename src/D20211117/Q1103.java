package D20211117;

/**
 * 1103. Distribute Candies to People
 */
public class Q1103 {

    public int[] distributeCandies(int candies, int num_people) {

        int[] result = new int[num_people];
        int idx = 0;

        while(candies > 0) {
            result[idx % num_people] += Math.min(idx+1, candies);
            candies -= idx + 1;
            idx++;
        }

        return result;
    }
}
