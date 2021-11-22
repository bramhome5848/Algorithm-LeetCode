package D20211122;

import java.util.ArrayList;
import java.util.List;

/**
 * 1313. Decompress Run-Length Encoded List
 */
public class Q1313 {

    public int[] decompressRLElist1(int[] nums) {

        int size = 0;
        for(int i=0 ; i<nums.length ; i+=2) size += nums[i];

        int[] result = new int[size];
        int idx = 0;

        for(int i=0 ; i<nums.length ; i+=2) {
            while(nums[i]-- > 0) result[idx++] = nums[i+1];
        }

        return result;
    }

    public int[] decompressRLElist2(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i=0 ; i<nums.length ; i+=2) {
            while(nums[i]-- > 0) result.add(nums[i+1]);
        }

        return result.stream().mapToInt(s -> s).toArray();
    }
}
