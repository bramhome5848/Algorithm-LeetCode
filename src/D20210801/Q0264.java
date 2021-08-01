package D20210801;

/**
 * 264. Ugly Number II
 */
public class Q0264 {

    public int nthUglyNumber(int n) {

        if(n == 1) return 1;

        int[] result = new int[n];
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        result[0] = 1;

        for(int i=1 ; i<n ; i++){
            result[i] = Math.min(result[p2] * 2 , Math.min(result[p3] * 3, result[p5] * 5));

            if(result[i] == result[p2] * 2) p2++;
            if(result[i] == result[p3] * 3) p3++;
            if(result[i] == result[p5] * 5) p5++;
        }

        return result[n-1];
    }
}
