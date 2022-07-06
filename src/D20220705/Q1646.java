package D20220705;

import java.util.Arrays;

/**
 * 1646. Get Maximum in Generated Array
 */
public class Q1646 {

    public int getMaximumGenerated(int n) {

        if(n < 2) return n;

        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2 ; i<n+1 ; i++) {
            if(i % 2 == 0) arr[i] = arr[i/2];
            else arr[i] = arr[(i-1)/2] + arr[(i-1)/2 + 1];
        }

        return Arrays.stream(arr).max().getAsInt();
    }
}
