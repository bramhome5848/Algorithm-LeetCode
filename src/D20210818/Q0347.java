package D20210818;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 347. Top K Frequent Elements
 */
public class Q0347 {

    public int[] topKFrequent1(int[] nums, int k) {

        if(k == nums.length) return nums;

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.comparingInt(map::get));
        int[] result = new int[k];

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            que.add(key);
            if(que.size() > k) que.poll();
        }

        while(k-- > 0) {
            result[k] = que.poll();
        }

        return result;
    }

    public int[] topKFrequent2(int[] nums, int k) {

        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().sorted((s1, s2) -> (int) (s2.getValue() - s1.getValue()))
                .limit(k).mapToInt(Map.Entry::getKey).toArray();
    }

    public int[] topKFrequent3(int[] nums, int k) {

        PriorityQueue<int[]> que = new PriorityQueue<>(Comparator.comparingInt(d -> d[1]));
        int[] result = new int[k];

        Arrays.sort(nums);

        int j = 0;
        for(int i=0 ; i<nums.length+1 ; i++) {
            if(i == nums.length || nums[i] != nums[j]) {
                que.add(new int[]{nums[j], i-j});
                if(que.size() > k) que.poll();

                j = i;
            }
        }

        for(int i=k-1 ; i>-1 ; i--) result[i] = que.poll()[0];
        return result;
    }
}
