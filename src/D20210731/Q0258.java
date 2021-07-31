package D20210731;

/**
 * 258. Add Digits
 */
public class Q0258 {

    /**
     *  without any loop/recursion in O(1) runtime?
     */
    public int addDigits(int num) {
        if(num == 0) return 0;
        if(num % 9 == 0)  return 9;
        return (num % 9);
    }
}
