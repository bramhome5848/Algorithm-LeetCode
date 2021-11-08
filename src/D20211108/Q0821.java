package D20211108;

/**
 * 821. Shortest Distance to a Character
 */
public class Q0821 {

    public int[] shortestToChar(String s, char c) {

        int[] result = new int[s.length()];
        int idx = 0;

        for(int i=0 ; i<s.length() ; i++) {
            if(i == 0) idx = s.indexOf(c);
            if(i > idx && s.indexOf(c, i) >= 0
                    && Math.abs(idx-i) > Math.abs(s.indexOf(c, i)-i)) {
                idx = s.indexOf(c, i);
            }
            result[i] = Math.abs(idx-i);
        }

        return result;
    }
}
