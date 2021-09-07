package D20210907;

/**
 * 413. Arithmetic Slices
 */
public class Q0413 {

    public int numberOfArithmeticSlices1(int[] nums) {

        if (nums == null || nums.length < 3) return 0;

        int[] length = new int[nums.length];    //i까지 등차수열이 나오는 경우의 수
        int result = 0;

        for(int i=2 ; i<nums.length ; i++) {
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]) {
                length[i] = length[i-1] + 1;
                result += length[i];
                System.out.println(result);
            }
        }
        return result;
    }
}
