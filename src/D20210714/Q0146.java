package D20210714;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146. LRU Cache
 */
public class Q0146 {

    public static class LRUCache {

        private final Map<Integer, Integer> map;
        private final int capacity;

        public LRUCache(int capacity) {
            map = new LinkedHashMap<>(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        public int get(int key) {
            return map.getOrDefault(key, -1);
        }

        public void put(int key, int value) {

            map.put(key, value);
            if(map.size() > capacity) {
                int leastUseKey = map.keySet().iterator().next();
                map.remove(leastUseKey);
            }
        }
    }

}
