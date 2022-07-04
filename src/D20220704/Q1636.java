package D20220704;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1636. Sort Array by Increasing Frequency
 */
public class Q1636 {

    public int[] frequencySort(int[] nums) {

        int idx = 0;

        List<Map.Entry<Integer, Long>> sortedFreqMap = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().sorted((f1, f2) -> f1.getValue().equals(f2.getValue()) ? f2.getKey() - f1.getKey() : (int) (f1.getValue() - f2.getValue()))
                .collect(Collectors.toList());

        for (Map.Entry<Integer, Long> entry : sortedFreqMap) {
            int key = entry.getKey();
            int value = entry.getValue().intValue();

            for(var i=0 ; i<value ; i++) {
                nums[idx++] = key;
            }
        }

        return nums;
    }
}
