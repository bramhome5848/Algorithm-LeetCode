package D20220710;

/**
 * 1758. Minimum Changes To Make Alternating Binary String
 */
public class Q1758 {

    public int minOperations(String s) {

        int cnt1 = 0;
        int cnt2 = 0;
        char[] num = {'0', '1'};

        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) == num[i & 1]) cnt1++;
            else cnt2++;
        }

        return Math.min(cnt1, cnt2);
    }
}
