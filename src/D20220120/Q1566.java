package D20220120;

import java.util.Arrays;

/**
 * 1566. Detect Pattern of Length M Repeated K or More Times
 */
public class Q1566 {

    public boolean containsPattern1(int[] arr, int m, int k) {

        for(int i=0 ; i<arr.length-m ; i++) {
            int[] curr = Arrays.copyOfRange(arr, i, i+m);
            int count = 1;

            for(int j=i+m ; j<arr.length ; j+=m) {
                int[] next = Arrays.copyOfRange(arr, j, j+m);
                if(Arrays.equals(curr, next)) count++;
                else break;

                if(count >= k) return true;
            }
        }

        return false;
    }

    public boolean containsPattern2(int[] arr, int m, int k) {

        int repeat = 0;
        int count = 1;

        for(int i=0 ; i+m < arr.length ; i++) {
            if(arr[i] == arr[i+m]) repeat++;
            else {
                repeat = 0;
                count = 1;
            }

            if(repeat == m) {
                repeat = 0;
                count++;
            }

            if(count == k) return true;
        }

        return false;
    }
}
