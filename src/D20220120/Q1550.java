package D20220120;

/**
 * 1550. Three Consecutive Odds
 */
public class Q1550 {

    public boolean threeConsecutiveOdds1(int[] arr) {

        for(int i=0 ; i<arr.length-2 ; i++) {
            if(arr[i] % 2 == 1 && arr[i+1] % 2 == 1 && arr[i+2] % 2 == 1) return true;
        }
        return false;
    }

    public boolean threeConsecutiveOdds2(int[] arr) {
        int count = 0;

        for(int value : arr) {
            if(value % 2 == 1) count++;
            else count = 0;

            if(count == 3) return true;
        }

        return false;
    }
}
