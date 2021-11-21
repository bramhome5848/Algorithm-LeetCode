package D20211121;

/**
 * 1266. Minimum Time Visiting All Points
 */
public class Q1266 {

    public int minTimeToVisitAllPoints(int[][] points) {

        if(points.length == 1) return 0;

        int result = 0;
        int[] idx = points[0];

        for(int i=1 ; i<points.length ; i++) {
            result += Math.max(Math.abs(points[i][0] - idx[0]), Math.abs(points[i][1] - idx[1]));
            idx = points[i];
        }

        return result;
    }
}
