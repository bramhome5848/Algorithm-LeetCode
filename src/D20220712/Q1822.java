package D20220712;

/**
 * 1822. Sign of the Product of an Array
 */
public class Q1822 {

    public int arraySign(int[] nums) {
        int count = 0;

        for(int num : nums) {
           if(num == 0) return 0;
           if(num < 0) count++;
        }

        return count % 2 == 0 ? 1 : -1;
    }
}
