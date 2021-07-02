package D20210702;

import java.util.HashMap;
import java.util.Map;

/**
 * 91. Decode Ways
 */
public class Q0091 {

    public int numDecodings(String s) {

        if(s.charAt(0) == '0') return 0;

        int[] result = new int[s.length()];
        result[0] = 1;

        for(int i=1 ; i<s.length() ; i++) {
            if(s.charAt(i-1) == '0') {
                if(s.charAt(i) == '0') result[i] = 0;   //"00"
                else result[i] = result[i-1];   //"0X"
            } else {
                if(s.charAt(i) == '0') {    //"x0"
                    if(s.charAt(i-1) == '1' || s.charAt(i-1) =='2') result[i] = (i>=2 ? result[i-2] : 1);
                    else result[i] = 0;
                } else {    //"xx"
                    if(Integer.parseInt(s.substring(i-1, i+1)) <= 26) result[i] = result[i-1] + (i>=2 ? result[i-2] : 1);
                    else result[i] = result[i-1];
                }
            }
        }

        return result[result.length-1];
    }
}
