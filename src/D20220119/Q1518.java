package D20220119;

/**
 * 1518. Water Bottles
 */
public class Q1518 {

    public int numWaterBottles(int numBottles, int numExchange) {

        int result = numBottles;
        int rem = numBottles;

        while(rem / numExchange != 0) {
            result += rem / numExchange;
            rem = rem / numExchange + rem % numExchange;
        }

        return result;
    }
}
