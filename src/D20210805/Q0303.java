package D20210805;

/**
 * 303. Range Sum Query - Immutable
 */
public class Q0303 {
}

class NumArray {

    private int[] sumArray;

    public NumArray(int[] nums) {
        sumArray = new int[nums.length];

        sumArray[0] = nums[0];
        for(int i=1 ; i<nums.length ; i++) {
            sumArray[i] = sumArray[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if(left == 0) return sumArray[right];
        return sumArray[right] - sumArray[left-1];
    }
}
