package D20220722;

import java.util.Arrays;

/**
 * 2037. Minimum Number of Moves to Seat Everyone
 */
public class Q2037 {

    public int minMovesToSeat(int[] seats, int[] students) {

        Arrays.sort(seats);
        Arrays.sort(students);

        int result = 0;

        for(int i=0 ; i<seats.length ; i++) {
            result += Math.abs(seats[i] - students[i]);
        }

        return result;
    }
}
