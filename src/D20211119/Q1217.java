package D20211119;

/**
 * 1217. Minimum Cost to Move Chips to The Same Position
 */
public class Q1217 {

    //odd -> odd = 0
    //even -> even = 0
    //odd -> even = 1
    //even -> odd = 1
    public int minCostToMoveChips(int[] position) {

        int odd = 0;
        int even = 0;

        for(int value : position) {
           if(value % 2 == 0) even++;
           else odd++;
        }

        return Math.min(even, odd);
    }
}
