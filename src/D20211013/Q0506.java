package D20211013;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 506. Relative Ranks
 */
public class Q0506 {

    public String[] findRelativeRanks(int[] score) {

        //value, index pair
        Map<Integer, Integer> map = new HashMap<>();
        String[] result = new String[score.length];

        for(int i=0 ; i<score.length ; i++) map.put(score[i], i);
        Arrays.sort(score);

        if((score.length-1)>=0) result[map.get(score[score.length-1])]="Gold Medal";
        if((score.length-2)>=0) result[map.get(score[score.length-2])]="Silver Medal";
        if((score.length-3)>=0) result[map.get(score[score.length-3])]="Bronze Medal";

        for(int i=score.length-4 ; i>-1 ; i--) {
            result[map.get(score[i])] = String.valueOf(score.length-i);
        }

        return result;
    }
}
