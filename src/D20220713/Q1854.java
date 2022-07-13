package D20220713;

import java.util.Arrays;

/**
 * 1854. Maximum Population Year
 */
public class Q1854 {

    //100n
    public int maximumPopulation1(int[][] logs) {

        int result = 0;
        int maxPop = 0;

        for(int year=1950 ; year<2051 ; year++) {
            int count = 0;
            for(int[] log : logs) {
               if(log[0] <= year && year < log[1]) count++;
            }

            if(maxPop < count) {
                maxPop = count;
                result = year;
            }
        }

        return result;
    }

    //n + 200
    public int maximumPopulation2(int[][] logs) {

        int[] arr = new int[101];
        int max = 0;
        int year = 0;

        for(int[] log : logs) {
            arr[log[0] - 1950]++;
            arr[log[1] - 1950]--;
        }

        for(int i=1 ; i<arr.length ; i++) arr[i] += arr[i-1];

        for(int i=0 ; i<arr.length ; i++) {
            if(max < arr[i]) {
                max = arr[i];
                year = i;
            }
        }

        return year + 1950;
    }
}
