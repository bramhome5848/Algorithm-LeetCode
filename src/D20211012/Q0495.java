package D20211012;

/**
 * 495. Teemo Attacking
 */
public class Q0495 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = duration;

        for (int i=1 ; i<timeSeries.length ; i++) {
            result += Math.min(timeSeries[i] - timeSeries[i - 1], duration);
        }

        return result;
    }
}
