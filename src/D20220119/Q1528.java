package D20220119;

/**
 * 1528. Shuffle String
 */
public class Q1528 {

    public String restoreString1(String s, int[] indices) {

        char[] result = new char[s.length()];

        for(int i=0 ; i<s.length() ; i++) {
            result[indices[i]] = s.charAt(i);
        }

        return String.valueOf(result);
    }

    public String restoreString2(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        sb.setLength(s.length());

        for(int i = 0; i < s.length(); i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }

        return sb.toString();
    }
}
