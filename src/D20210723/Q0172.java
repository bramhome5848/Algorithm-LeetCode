package D20210723;

/**
 * 172. Factorial Trailing Zeroes
 */
public class Q0172 {

    //곱해서 0을 만드려면 5가 반드시 필요
    //5가 등장하는 횟수에 따라 0이 개수도 정해짐
    public int trailingZeroes(int n) {
        int result = 0;
        for(int i=5 ; i<n+1 ; i=i*5) {
            result += n / i;
        }
        return result;
    }
}
