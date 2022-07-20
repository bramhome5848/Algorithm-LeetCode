package D20220721;

/**
 * 2027. Minimum Moves to Convert String
 */
public class Q2027 {

    public int minimumMoves(String s) {
        if(!s.contains("X")) return 0;
        int count = 0;
        int idx = 0;

        while(idx < s.length()) {
            if(s.charAt(idx) == 'X') {
                idx += 3;
                count++;
                continue;
            }
            idx++;
        }

        return count;
    }
}
