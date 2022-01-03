package D20220103;

import java.util.ArrayList;
import java.util.List;

/**
 * 1389. Create Target Array in the Given Order
 */
public class Q1389 {

    public int[] createTargetArray1(int[] nums, int[] index) {

        List<Integer> result = new ArrayList<>();

        for(int i=0 ; i<nums.length ; i++) result.add(index[i], nums[i]);

        return result.stream().mapToInt(s -> s).toArray();
    }

    public int[] createTargetArray2(int[] nums, int[] index) {

        for(int i=0 ; i<nums.length;i++) {

            if(index[i] < i) {
                int k = i-1;
                int tmp = nums[i];

                while(k >= 0) {
                    nums[k+1] = nums[k];
                    if(k == index[i]) {
                        nums[k] = tmp;
                        break;
                    }
                    k--;
                }
            }
        }
        return nums;
    }
}
