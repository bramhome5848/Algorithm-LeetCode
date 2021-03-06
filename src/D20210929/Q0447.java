package D20210929;

import java.util.HashMap;
import java.util.Map;

/**
 * 447. Number of Boomerangs
 */
public class Q0447 {

    public int numberOfBoomerangs(int[][] points) {

        if (points == null || points.length <= 1) return 0;

        int result = 0;

        for(int i=0 ; i<points.length ; i++) {

            Map<Integer, Integer> map = new HashMap<>();

            for(int j=0 ; j<points.length ; j++) {

                if(i == j) continue;
                int distance = getDistance(points[i], points[j]);
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }

            for(int count : map.values()) {
               result += count * (count-1);
            }
        }

        return result;
    }

    private int getDistance(int[] p1, int[] p2) {
        int dx = p1[0] - p2[0];
        int dy = p1[1] - p2[1];
        return dx * dx + dy * dy;
    }
}
