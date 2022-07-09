package D20220709;

/**
 * 1736. Latest Time by Replacing Hidden Digits
 */
public class Q1736 {

    public String maximumTime(String time) {

        char[] ch = time.toCharArray();

        if(ch[0] == '?') {
            if(ch[1] == '?') {
                ch[0] = '2';
                ch[1] = '3';
            } else {
                if(ch[1] > '3') {
                    ch[0] = '1';
                } else {
                    ch[0] = '2';
                }
            }
        }

        if(ch[1] == '?') {
            if(ch[0] < '2') {
                ch[1] = '9';
            } else {
                ch[1] = '3';
            }
        }

        if(ch[3] == '?') {
            ch[3] = '5';
        }

        if(ch[4] == '?') {
            ch[4] = '9';
        }

        return String.valueOf(ch);
    }
}
