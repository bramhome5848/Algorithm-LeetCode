package D20210630;

public class Q0080 {

    public int removeDuplicates(int[] nums) {

        int index = 0;
        int value = nums[0];
        int count = 0;

        for(int i=0 ; i<nums.length ; i++) {
            if(value == nums[i]) {
                count++;
                if(count > 2) {
                    if(i < nums.length-1) nums[index] = nums[i+1];
                } else {
                    nums[index++] = nums[i];
                }
            } else {
                value = nums[i];
                count = 1;
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
