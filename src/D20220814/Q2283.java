package D20220814;

/**
 * 2283. Check if Number Has Equal Digit Count and Digit Value
 */
public class Q2283 {

    public boolean digitCount(String num) {

        int[] freq = new int[10];

        for(int i=0 ; i<num.length() ; i++) freq[num.charAt(i) - '0']++;
        for(int i=0 ; i<num.length() ; i++) {
            if(num.charAt(i) - '0' != freq[i]) return false;
        }

        return true;
    }
}
