package D20211118;

/**
 * 1184. Distance Between Bus Stops
 */
public class Q1184 {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if(start == destination) return 0;

        int dist1 = 0;
        int dist2 = 0;
        int idx = start;

        while(idx != destination) {
            if(idx == distance.length) idx = 0;
            if(idx == destination) break;
            dist1 += distance[idx++];
        }

        idx = start;
        while(idx != destination) {
            idx--;
            if(idx == -1) idx = distance.length - 1;
            dist2 += distance[idx];
        }

        return Math.min(dist1, dist2);
    }
}
