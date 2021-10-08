package D20211008;

import java.util.Arrays;

/**
 * 475. Heaters
 */
public class Q0475 {

    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int pre = heaters[0];
        int idx = 0;
        int result = 0;

        for(int house : houses) {
            while(idx<heaters.length-1 && heaters[idx]<house) {
                pre = heaters[idx++];
            }

            result = Math.max(result, Math.min(Math.abs(house - pre), Math.abs(house - heaters[idx])));
        }

        return result;
    }
}
