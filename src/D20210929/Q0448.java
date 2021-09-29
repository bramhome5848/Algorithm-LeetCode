package D20210929;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 448. Find All Numbers Disappeared in an Array
 */
public class Q0448 {


    /**
     * without extra space and in O(n) runtime
     * returned list does not count as extra space.
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        //Cycle Sort
        int i = 0;

        while(i < nums.length) {
            int idx = nums[i] - 1;
            if(i != idx && nums[i] != nums[idx]) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for(int j=0 ; j<nums.length ; j++) {
            if(j != nums[j]-1) result.add(j+1);
        }
        return result;
    }
}
