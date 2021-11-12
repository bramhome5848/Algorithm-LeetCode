package D20211112;

/**
 * 941. Valid Mountain Array
 */
public class Q0941 {

    public boolean validMountainArray(int[] arr) {

        if(arr.length < 3) return false;

        int idx = 0;
        boolean left = false;
        boolean right = false;

        while(idx < arr.length-1 && arr[idx] <= arr[idx+1]) {
            if(arr[idx] == arr[idx+1]) return false;
            left = true;
            idx++;
        }


        while(idx < arr.length-1) {
            if(arr[idx] <= arr[idx+1]) return false;
            right = true;
            idx++;
        }

        return left && right;
    }
}
