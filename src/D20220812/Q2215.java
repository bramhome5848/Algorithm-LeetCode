package D20220812;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 2215. Find the Difference of Two Arrays
 */
public class Q2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> temp = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

        set1.removeAll(set2);
        set2.removeAll(temp);

        return List.of(
                new ArrayList<>(set1),
                new ArrayList<>(set2)
        );
    }

    public List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        return List.of(
                Arrays.stream(nums1).boxed().filter(s -> !set2.contains(s)).distinct().collect(Collectors.toList()),
                Arrays.stream(nums2).boxed().filter(s -> !set1.contains(s)).distinct().collect(Collectors.toList())
        );
    }
}
