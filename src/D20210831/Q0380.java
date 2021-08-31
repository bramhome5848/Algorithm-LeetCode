package D20210831;

import java.util.*;

/**
 * 380. Insert Delete GetRandom O(1)
 */
public class Q0380 {
}

class RandomizedSet {

    private final Set<Integer> set;
    private final Random random;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new HashSet<>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!set.contains(val)) {
            set.add(val);
            return true;
        }
        return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return set.stream().mapToInt(s -> s).toArray()[random.nextInt(set.size())];
    }
}