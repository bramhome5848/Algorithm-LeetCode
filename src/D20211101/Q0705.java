package D20211101;

import java.util.HashSet;
import java.util.Set;

/**
 * 705. Design HashSet
 */
public class Q0705 {
}

class MyHashSet {

    private final Set<Integer> set;
    public MyHashSet() {
        set = new HashSet<>();
    }

    public void add(int key) {
        set.add(key);
    }

    public void remove(int key) {
        set.remove(key);
    }

    public boolean contains(int key) {
        return set.contains(key);
    }
}