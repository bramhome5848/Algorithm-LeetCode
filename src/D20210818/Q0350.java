package D20210818;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 350. Intersection of Two Arrays II
 */
public class Q0350 {

    public int[] intersect1(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        int idx1 = 0;
        int idx2 = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(idx1 < nums1.length && idx2 < nums2.length) {

            if(nums1[idx1] == nums2[idx2]) {
                result.add(nums1[idx1]);
                idx1++;
                idx2++;
            } else if(nums1[idx1] < nums2[idx2]) idx1++;
            else idx2++;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] intersect2(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Long> map = Arrays.stream(nums1).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                map.put(num, map.get(num) - 1);
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
