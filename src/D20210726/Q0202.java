package D20210726;

/**
 * 202. Happy Number
 */
public class Q0202 {

    public boolean isHappy(int n) {

        while(n > 9) {  //2자리 이상이면 진행
            int sum = 0;

            while(n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }

        return n == 1 || n == 7;    //7 -> 49 -> 97 -> 130 -> 10 -> 1
    }
}
