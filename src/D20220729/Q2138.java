package D20220729;

/**
 * 2138. Divide a String Into Groups of Size k
 */
public class Q2138 {

    public String[] divideString(String s, int k, char fill) {

        StringBuilder result = new StringBuilder(s);
        int fillLength = s.length() % k == 0 ? 0 : k - (s.length() % k);
        result.append(String.valueOf(fill).repeat(Math.max(0, fillLength)));

        return result.toString().split("(?<=\\G.{" + k + "})");
    }
}
