package D20211115;

/**
 * 1009. Complement of Base 10 Integer
 */
public class Q1009 {

    public int bitwiseComplement1(int n) {
        int length = Integer.toBinaryString(n).length();
        return (1<<length)-1-n;
    }

    public int bitwiseComplement2(int n) {
        return n == 0 ? 1 : ~n & Integer.highestOneBit(n)-1;
    }
}
