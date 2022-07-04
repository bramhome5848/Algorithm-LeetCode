package D20220704;

import java.util.Arrays;

/**
 * 1619. Mean of Array After Removing Some Elements
 */
public class Q1619 {

    public double trimMean1(int[] arr) {

        int remCnt = arr.length * 5 / 100;
        double result = 0;

        Arrays.sort(arr);

        for(int i=remCnt ; i<arr.length-remCnt ; i++) {
            result += arr[i];
        }

        return result / (arr.length-2*remCnt);
    }

    public double trimMean2(int[] arr) {
        return Arrays.stream(arr).sorted()
                .skip(arr.length / 20).limit(arr.length - arr.length / 10)
                .average().getAsDouble();
    }
}
