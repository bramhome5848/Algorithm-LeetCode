package D20220814;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2293. Min Max Game
 */
public class Q2293 {

    public int minMaxGame1(int[] nums) {

        Queue<Integer> que = new LinkedList<>();
        int count = 0;

        for(int num : nums) que.add(num);

        while(que.size() >= 2) {
            int value1 = que.poll();
            int value2 = que.poll();

            if(count++ % 2 == 0) que.add(Math.min(value1, value2));
            else que.add(Math.max(value1, value2));
        }

        return que.poll();
    }

    public int minMaxGame2(int[] nums) {

        if(nums.length == 1) return nums[0];
        int[] result = new int[nums.length / 2];

        for(int i=0 ; i<nums.length/2 ; i++) {
            if(i%2 == 0) result[i] = Math.min(nums[2*i], nums[2*i+1]);
            else result[i] = Math.max(nums[2*i], nums[2*i+1]);
        }

        return minMaxGame2(result);
    }
}
