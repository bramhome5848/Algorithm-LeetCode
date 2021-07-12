package D20210712;

/**
 * 134. Gas Station
 */
public class Q0134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int minFuel = Integer.MAX_VALUE;
        int minIdx = 0;
        int currFuel = 0;

        for(int i=0 ; i<gas.length ; i++) {
            currFuel += gas[i] - cost[i];
            if(currFuel < minFuel) {
                minFuel = currFuel;
                minIdx = i;
            }
        }

        return currFuel >= 0 ? (minIdx+1) % gas.length : -1;
    }
}
