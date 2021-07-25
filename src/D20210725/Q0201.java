package D20210725;

/**
 * 201. Bitwise AND of Numbers Range
 */
public class Q0201 {

    public static void main(String[] args) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        System.out.println(rangeBitwiseAnd(left, right));
    }
    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while(left != right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        right <<= shift;
        return right;
    }
}
