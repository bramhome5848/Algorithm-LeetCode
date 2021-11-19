package D20211119;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1232. Check If It Is a Straight Line
 */
public class Q1232 {

    public boolean checkStraightLine(int[][] coordinates) {

        int xMove = coordinates[1][0] - coordinates[0][0];
        int yMove = coordinates[1][1] - coordinates[0][1];

        for(int i=1 ; i<coordinates.length ; i++) {
            int x = coordinates[i][0] - coordinates[i-1][0];
            int y = coordinates[i][1] - coordinates[i-1][1];

            if(y * xMove != x * yMove) return false;
        }

        return true;
    }
}
