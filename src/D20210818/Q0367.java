package D20210818;

/**
 * 367. Valid Perfect Square
 */

public class Q0367 {

    //Do not use any built-in library function such as sqrt
    public boolean isPerfectSquare(int num) {

        int left = 1;
        int right = num;
        long mid;

        while(left <= right) {
            mid = left + (right-left)/2;
            if(mid * mid == num) return true;
            else if(mid * mid < num) left = (int)mid+1;
            else right = (int)mid-1;
        }

        return false;
    }
}
