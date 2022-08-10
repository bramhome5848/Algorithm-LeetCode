package D20220810;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 2200. Find All K-Distant Indices in an Array
 */
public class Q2200 {

    public List<Integer> findKDistantIndices1(int[] nums, int key, int k) {

        List<Integer> idxList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] == key) idxList.add(i);
        }

        for(int idx : idxList) {
            for(int i=Math.max(idx - k, 0) ; i<Math.min(idx+k+1, nums.length) ; i++) set.add(i);
        }

        return set.stream().sorted().collect(Collectors.toList());
    }

    public List<Integer> findKDistantIndices2(int[] nums, int key, int k) {

        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] == key) {
                start = Math.max(i-k, start);
                end = Math.min(i+k, nums.length-1);
                while(start <= end) result.add(start++);
            }
        }

        return result;
    }
}
