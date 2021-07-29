package D20210729;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 229. Majority Element II
 */
public class Q0229 {

    public List<Integer> majorityElement1(int[] nums) {

        List<Integer> result = new ArrayList<>();
        int time = nums.length / 3;

        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() > time).map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    //O(N), O(1) -> Boyer Moore Voting Algo
    public List<Integer> majorityElement2(int[] nums) {

        if(nums == null) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        int num1 = nums[0];
        int num2 = nums[0];
        int count1 = 1;
        int count2 = 0;

        for(int i=1 ; i<nums.length ; i++){
            int num = nums[i];

            if(num == num1) count1++;
            else if(num == num2) count2++;
            else if(count1 == 0) {
                num1 = num;
                count1 = 1;
            } else if(count2 == 0) {
                num2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if(num == num1) count1++;
            else if(num == num2) count2++;
        }

        if(count1 > nums.length/3) result.add(num1);
        if(count2 > nums.length/3) result.add(num2);

        return result;
    }
}
