package D20220711;

/**
 * 1784. Check if Binary String Has at Most One Segment of Ones
 */
public class Q1784 {

    public boolean checkOnesSegment(String s) {

        if(s.length() == 1) return true;
        return !s.contains("10") || !s.contains("01");
    }
}
