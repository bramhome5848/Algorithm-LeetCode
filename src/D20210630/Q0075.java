package D20210630;

/**
 * 75. Sort Colors
 */
public class Q0075 {

    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int index = 0;

        for(int value : nums) {
            if(value == 0) zero++;
            else if(value == 1) one++;
            else two++;
        }

        while(zero>0 || one>0 || two>0) {
            if(zero > 0) {
                nums[index++] = 0;
                zero--;
            } else if(one > 0) {
                nums[index++] = 1;
                one--;
            } else {
                nums[index++] = 2;
                two--;
            }
        }
    }
}
