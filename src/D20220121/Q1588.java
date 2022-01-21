package D20220121;

/**
 * 1588. Sum of All Odd Length Subarrays
 */
public class Q1588 {

    public static int sumOddLengthSubarrays(int[] arr) {

        int result = 0;

        for(int i=0 ; i<arr.length ; i++) {
            int length = i + 1;
            int num = arr.length - i;
            int total = length * num;
            int odd = total / 2;
            if(total % 2 == 1) odd++;

            result += odd * arr[i];
        }

        return result;
    }
}