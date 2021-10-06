package D20211006;

/**
 * 459. Repeated Substring Pattern
 */
public class Q0459 {

    public boolean repeatedSubstringPattern(String s) {

        for(int i=1 ; i<s.length()/2+1 ; i++) {

            StringBuilder sb = new StringBuilder();
            if(s.length()%i != 0) continue;

            if(i == 1) {
                sb.append(s.substring(1));
                sb.append(s.charAt(0));
            } else {
                sb.append(s.substring(i));
                sb.append(s, 0, i);
            }
            if(s.equals(sb.toString())) return true;
        }
        return false;
    }
}
