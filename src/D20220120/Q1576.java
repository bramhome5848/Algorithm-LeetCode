package D20220120;

/**
 * 1576. Replace All ?'s to Avoid Consecutive Repeating Characters
 */
public class Q1576 {

    public String modifyString(String s) {

        StringBuilder result = new StringBuilder(s);

        for(int i=0 ; i<result.length() ; i++) {
            if(result.charAt(i) == '?') {
                for(char c='a' ; c<'z'+1 ; c++) {
                    if((i == 0 || c != result.charAt(i-1)) && (i == result.length()-1 || c != result.charAt(i+1))) {
                        result.setCharAt(i, c);
                        break;
                    }
                }
            }
        }

        return result.toString();
    }
}
