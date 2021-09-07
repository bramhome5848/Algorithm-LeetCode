package D20210907;

/**
 * 405. Convert a Number to Hexadecimal
 */
public class Q0405 {

    public String toHex(int num) {

        if(num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        long y = num < 0 ? num & 0x00000000ffffffffL : num;

        while(y != 0) {
            char hex = (char) (y % 16 < 10 ? y % 16 + '0' : y % 16 - 10 + 'a');
            sb.insert(0, hex);
            y >>= 4;
        }

        return sb.toString();
    }
}
