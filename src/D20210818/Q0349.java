package D20210818;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 349. Intersection of Two Arrays
 */
public class Q0349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> data1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> data2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        data1.retainAll(data2);
        return data1.stream().mapToInt(Integer::intValue).toArray();
    }
}
