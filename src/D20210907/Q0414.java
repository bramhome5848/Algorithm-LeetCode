package D20210907;

import java.util.TreeSet;

/**
 * 414. Third Maximum Number
 */
public class Q0414 {

    public int thirdMax(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>();

        for(int value : nums) {
            set.add(value);
            if(set.size()>3) set.pollFirst();
        }

        return set.size() < 3 ? set.pollLast() : set.pollFirst();
    }
}
