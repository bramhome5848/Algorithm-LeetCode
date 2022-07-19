package D20220719;

/**
 * 1961. Check If String Is a Prefix of Array
 */
public class Q1961 {

    public boolean isPrefixString(String s, String[] words) {

        StringBuilder concat = new StringBuilder();

        for(String word : words) {
            concat.append(word);

            if(!s.startsWith(concat.toString())) return false;
            if(s.length() == concat.length()) break;
        }

        return s.length() == concat.length();
    }
}
