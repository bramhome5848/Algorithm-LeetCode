package D20211101;

import java.util.HashMap;
import java.util.Map;

/**
 * 706. Design HashMap
 */
public class Q0706 {
}

class MyHashMap {

    private final Map<Integer, Integer> map;
    public MyHashMap() {
        map = new HashMap<>();
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    public int get(int key) {
        if(map.containsKey(key)) return map.get(key);
        return -1;
    }

    public void remove(int key) {
        map.remove(key);
    }
}