package D20211122;

/**
 * 1317. Convert Integer to the Sum of Two No-Zero Integers
 */
public class Q1317 {

    public int[] getNoZeroIntegers1(int n) {

        for(int i=1 ; i<n ; i++) {
            if(String.valueOf(i).indexOf('0') == -1
                && String.valueOf(n-i).indexOf('0') == -1) return new int[]{i, n-i};
        }

        return null;
    }

    public int[] getNoZeroIntegers2(int n) {

        for(int i=1 ; i<n ; i++) {
            if(containZero(i) && containZero(n - i)) return new int[]{i, n-i};
        }

        return null;
    }

    private boolean containZero(int n) {
        while(n > 0) {
            int rem = n % 10;
            if(rem == 0) return false;
            n /= 10;
        }

        return true;
    }
}
