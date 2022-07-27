package D20220727;

import java.util.ArrayList;
import java.util.List;

/**
 * 2094. Finding 3-Digit Even Numbers
 */
public class Q2094 {

    public int[] findEvenNumbers(int[] digits) {

        List<Integer> result = new ArrayList<>();
        int[] freq = new int[10];

        for(int digit : digits) freq[digit]++;

        for(int i=1 ; i<10 ; i++) {

            if(freq[i] == 0) continue;
            freq[i]--;

            for(int j=0 ; j<10 ; j++) {
                if(freq[j] == 0) continue;
                freq[j]--;

                for(int k=0 ; k<10 ; k+=2) {
                    if(freq[k] == 0) continue;
                    result.add(i * 100 + j * 10 + k);
                }
                freq[j]++;
            }
            freq[i]++;
        }

        return result.stream().mapToInt(s -> s).toArray();
    }
}
