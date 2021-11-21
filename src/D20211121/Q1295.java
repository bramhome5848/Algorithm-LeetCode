package D20211121;

/**
 * 1295. Find Numbers with Even Number of Digits
 */
public class Q1295 {

    public int findNumbers(int[] nums) {

        int result = 0;
        for(int num : nums) {
           if((int)Math.log10(num) % 2 == 1) result++;
        }

        return result;
    }
}
