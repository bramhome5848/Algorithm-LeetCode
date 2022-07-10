package D20220710;

/**
 * 1779. Find Nearest Point That Has the Same X or Y Coordinate
 */
public class Q1779 {

    public int nearestValidPoint(int x, int y, int[][] points) {

        int min = Integer.MAX_VALUE;
        int result = -1;

        for(int i=0 ; i<points.length ; i++) {
            if(x == points[i][0] || y == points[i][1]) {    //valid
                int dis = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(dis < min) {
                    min = dis;
                    result = i;
                }
            }
        }

        return result;
    }
}
