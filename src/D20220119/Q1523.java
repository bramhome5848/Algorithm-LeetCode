package D20220119;

/**
 * 1523. Count Odd Numbers in an Interval Range
 */
public class Q1523 {

    public int countOdds1(int low, int high) {
        if(low % 2 == 0) low++;
        if(high % 2 == 0) high--;

        return (high - low) / 2 + 1;
    }

    public int countOdds2(int low, int high) {
        return ((high % 2 == 0 ? --high : high) - (low % 2 == 0 ? ++low : low)) / 2 + 1;
    }
}
