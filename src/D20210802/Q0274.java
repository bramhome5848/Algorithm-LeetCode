package D20210802;

import java.util.Arrays;

/**
 * 274. H-Index
 */
public class Q0274 {

    //h회 이상 인용된 h개의 논문 -> h index
    public int hIndex(int[] citations) {

        Arrays.sort(citations);

        for(int i=citations.length ; i>0 ; i--) {
            if(citations[citations.length - i] >= i) return i;
        }

        return 0;
    }
}
