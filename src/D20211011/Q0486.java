package D20211011;

/**
 * 486. Predict the Winner
 */
public class Q0486 {

    public boolean PredictTheWinner(int[] nums) {

        //플레이어가 범위 내에서 얼마나 더 많은 점수를 얻을 수 있는지
        int[][] result = new int[nums.length][nums.length];

        for(int i=0 ; i<nums.length ; i++) result[i][i] = nums[i];

        for(int i=1 ; i<nums.length ; i++) {
            for(int j=0 ; j+i<nums.length ; j++) {
                result[j][j+i] = Math.max(nums[j] - result[j+1][j+i],
                        nums[j+i] - result[j][j+i-1]);
            }
        }

        return result[0][nums.length-1] >= 0;
    }
}
