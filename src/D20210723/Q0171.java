package D20210723;

/**
 * 171. Excel Sheet Column Number
 */
public class Q0171 {

    public int titleToNumber(String columnTitle) {

        int result = 0;
        for(int i=columnTitle.length()-1 ; i>-1 ; i--){
            result += (int)Math.pow(26, columnTitle.length()-1-i) * (columnTitle.charAt(i)+1-'A');
        }
        return result;
    }
}
