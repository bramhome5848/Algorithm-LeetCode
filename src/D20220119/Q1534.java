package D20220119;

/**
 * 1534. Count Good Triplets
 */
public class Q1534 {

    public int countGoodTriplets1(int[] arr, int a, int b, int c) {

        int result = 0;

        for(int i=0 ; i<arr.length-2 ; i++) {
            for(int j=i+1 ; j<arr.length-1 ; j++) {
                if(Math.abs(arr[i] - arr[j]) > a) continue;

                for(int k = j+1 ; k < arr.length ; k++) {
                    if(Math.abs(arr[j] - arr[k]) > b || Math.abs(arr[i] - arr[k]) > c) continue;
                    result++;
                }
            }
        }

        return result;
    }
}
