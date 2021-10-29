package D20211029;

/**
 * 696. Count Binary Substrings
 */
public class Q0696 {

    public int countBinarySubstrings(String s) {

        int[] cnt = new int[2];
        int result = 0;
        char prev = s.charAt(0);

        cnt[prev - '0']++;

        for(int i=1 ; i<s.length() ; i++) {
            char c = s.charAt(i);

            if(c != prev) {
                result += Math.min(cnt[0], cnt[1]);
                cnt[c - '0'] = 0;
                prev = c;
            }

            cnt[c - '0']++;
        }

        result += Math.min(cnt[0], cnt[1]);
        return result;
    }
}
