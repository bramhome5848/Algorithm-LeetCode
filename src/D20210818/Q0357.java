package D20210818;

/**
 * 357. Count Numbers with Unique Digits
 */
public class Q0357 {

    //n==1 -> 10
    //n==2 -> 9 * 9 + (n == 1)
    //n==3 -> 9 * 9 * 8 + (n == 2)
    //n==4 -> 9 * 9 * 8 * 7 + (n == 3)
    //n==5 -> 9 * 9 * 8 * 7 * 6 + (n == 4)
    public int countNumbersWithUniqueDigits(int n) {

        if(n == 0) return 1;
        else if(n == 1) return 10;

        int value = 9;
        int result = 10;

        for(int i=2 ; i<n+1 ; i++) {
            result += value *= 11 - i;
        }

        return result;
    }
}