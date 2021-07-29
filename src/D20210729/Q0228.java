package D20210729;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 228. Summary Ranges
 */
public class Q0228 {

    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        StringBuilder sb;

        for(int i=0, j=0 ; i<nums.length ; i++) {
            if(i == 0 || nums[i] != nums[i - 1] + 1) j = i;
            if(i == nums.length - 1 || nums[i] != nums[i + 1] - 1) {
                sb = new StringBuilder();
                sb.append(nums[j]);
                if(j != i) sb.append("->").append(nums[i]);
                result.add(sb.toString());
            }
        }
        return result;
    }
}
