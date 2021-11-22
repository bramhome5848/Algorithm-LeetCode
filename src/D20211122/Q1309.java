package D20211122;

/**
 * 1309. Decrypt String from Alphabet to Integer Mapping
 */
public class Q1309 {

    public String freqAlphabets(String s) {

        StringBuilder result = new StringBuilder();

        for(int i=s.length()-1 ; i>-1 ; i--) {
            if(s.charAt(i) == '#') {
                result.append((char)(96 + Integer.parseInt(s.substring(i-2, i))));
                i -= 2;
            }
            else result.append((char)(96+(s.charAt(i)-'0')));
        }

        return result.reverse().toString();
    }
}
