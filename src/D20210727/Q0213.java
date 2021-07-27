package D20210727;

/**
 * 213. House Robber II
 */
public class Q0213 {

    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        //nums[i] -> i번째 집을 털었을 때 얻을 수 있는 최대 금액
        //인접한 집은 털 수 없음
        //HouseRobber I과 다르게 처음과 끝이 연결되어 있는 cycle
        // 1. 처음집을 선택O , 끝집 선택 X
        // 2. 처음집을 선택X , 끝집 선택 O
        int fromZero = getResult(0, nums.length - 2, nums);
        int fromOne = getResult(1, nums.length - 1, nums);
        return Math.max(fromZero, fromOne);
    }

    private int getResult(int start, int end, int[] nums) {
        int sum = nums[start];
        int prev = 0;

        for(int i=start+1 ; i<end+1 ; i++) {
            int temp = sum;
            sum = Math.max(sum, prev + nums[i]);
            prev = temp;
        }
        return sum;
    }
}
