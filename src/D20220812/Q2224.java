package D20220812;

/**
 * 2224. Minimum Number of Operations to Convert Time
 */
public class Q2224 {

    public int convertTime(String current, String correct) {

        int[] split = {60, 15, 5};
        int idx = 0;
        int result = 0;

        int currTime = Integer.parseInt(current.substring(0, 2)) * 60
                + Integer.parseInt(current.substring(3));

        int corrTime = Integer.parseInt(correct.substring(0, 2)) * 60
                + Integer.parseInt(correct.substring(3));
        int diff = corrTime - currTime;

        while(diff >= 5) {
            result += diff / split[idx];
            diff %= split[idx++];
        }

        return result + diff;
    }
}
