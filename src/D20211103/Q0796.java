package D20211103;

/**
 * 796. Rotate String
 */
public class Q0796 {

    public boolean rotateString(String s, String goal) {

        if(s.equals(goal)) return true;
        if(s.length() != goal.length()) return false;

        StringBuilder sb = new StringBuilder(s);

        for(int i=0 ; i<s.length() ; i++) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);

            if(sb.toString().equals(goal)) return true;
        }
        return false;
    }
}
