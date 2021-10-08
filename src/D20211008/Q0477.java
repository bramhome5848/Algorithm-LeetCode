package D20211008;

/**
 * 477. Total Hamming Distance
 */
public class Q0477 {

    public int totalHammingDistance(int[] nums) {

        int result = 0;

        for(int i=0 ; i<32 ; i++) {
            int cnt = 0;
            for(int num : nums) {
                cnt += (num >> i) & 1;
            }
            result += cnt * (nums.length - cnt);
        }
        return result;
    }
}
