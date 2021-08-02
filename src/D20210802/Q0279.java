package D20210802;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

/**
 * 279. Perfect Squares
 */
public class Q0279 {

    public int numSquares(int n) {

        //result[i] = i를 만들기 위한 제곱수의 최소 개수
        int[] result = new int[n+1];
        for(int i=0 ; i<n+1 ; i++) result[i] = i;
        for(int i=1 ; i*i<n+1 ; i++) result[i*i] = 1;

        for(int i=2 ; i<n+1 ; i++) {
            for(int j=2; j*j < i ; j++) {
                result[i] = Math.min(result[i], result[i - j*j] + result[j*j]);
            }
        }
        return result[n];
    }
}
