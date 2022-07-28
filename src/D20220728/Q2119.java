package D20220728;

/**
 * 2119. A Number After a Double Reversal
 */
public class Q2119 {

    public boolean isSameAfterReversals1(int num) {

        int revNum = Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
        int rRevNum = Integer.parseInt(new StringBuilder(String.valueOf(revNum)).reverse().toString());

        return num == rRevNum;
    }

    public boolean isSameAfterReversals2(int num) {
        return num == 0 || !String.valueOf(num).endsWith("0");
    }
}
