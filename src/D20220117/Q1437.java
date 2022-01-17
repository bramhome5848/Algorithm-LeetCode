package D20220117;

/**
 * 1437. Check If All 1's Are at Least Length K Places Away
 */
public class Q1437 {

    public boolean kLengthApart(int[] nums, int k) {

        int idx = -1;

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] == 1) {
                if(idx != -1 && i-idx <= k) return false;
                idx = i;
            }
        }

        return true;
    }
}
