package D20220728;

/**
 * 2124. Check if All A's Appears Before All B's
 */
public class Q2124 {

    public boolean checkString1(String s) {

        char c = s.charAt(0);

        for(int i=1 ; i<s.length() ; i++) {
            if(s.charAt(i) < c) return false;
            c = s.charAt(i);
        }

        return true;
    }

    public boolean checkString2(String s) {

        if(s.indexOf('b') == -1) return true;
        return s.lastIndexOf('a') < s.indexOf('b');
    }
}
