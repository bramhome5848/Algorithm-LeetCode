package D20211026;

/**
 * 551. Student Attendance Record I
 */
public class Q0551 {

    public boolean checkRecord(String s) {

        int cnt = 0;

        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) == 'A') cnt++;
            if(cnt > 1) return false;
            if(s.length()-i >= 3 && (s.charAt(i) == 'L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L')) return false;
        }

        return true;
    }
}
