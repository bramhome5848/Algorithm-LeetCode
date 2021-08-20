package D20210820;

/**
 * 371. Sum of Two Integers
 */
public class Q0371 {

    //return the sum of the two integers without using the operators + and -.
    //bit manipulation
    //a == 7, b == 2 -> a + b == 5
    public int getSum(int a, int b) {

        int carry;
        while(b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}
