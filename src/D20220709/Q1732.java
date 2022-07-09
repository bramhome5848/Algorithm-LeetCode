package D20220709;

/**
 * 1732. Find the Highest Altitude
 */
public class Q1732 {

    public int largestAltitude(int[] gain) {

        int max = gain[0];

        for(int i=1 ; i<gain.length ; i++) {
            gain[i] = gain[i-1] + gain[i];
            max = Math.max(max, gain[i]);
        }

        return Math.max(max, 0);
    }
}
