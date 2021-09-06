package D20210906;

/**
 * 400. Nth Digit
 */
public class Q0400 {

    public int findNthDigit(int n) {

        int digit = 1;
        int interval = 9;

        while (n - interval > 0) {
            n -= interval;
            digit += 1;
            //interval -> 9*1 , 90 * 2, 900 * 3, 9000 * 4
            //9xx -> 개수, * x -> 자릿수
            interval = 9 * ((int) Math.pow(10, digit - 1)) * digit;

            //int 범위 넘을 경우 ex) n = 1000000000 -> interval 이 범위 초과
            if (interval < 0) break;
        }

        int base = ((int) Math.pow(10, digit - 1));
        int number =  base + (n - 1) / digit;
        char digit_in_number = String.valueOf(number).charAt((n - 1) % digit);

        return digit_in_number - '0';
    }
}
