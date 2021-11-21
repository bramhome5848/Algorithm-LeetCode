package D20211121;

/**
 * 1299. Replace Elements with Greatest Element on Right Side
 */
public class Q1299 {

    public int[] replaceElements(int[] arr) {

        int max = -1;

        for(int i=arr.length-1 ; i>-1 ; i--) {
            int value = arr[i];
            arr[i] = max;
            max = Math.max(max, value);
        }

        return arr;
    }
}
