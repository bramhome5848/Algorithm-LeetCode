package D20211026;

/**
 * 541. Reverse String II
 */
public class Q0541 {

    public String reverseStr(String s, int k) {

        StringBuilder data = new StringBuilder(s);

        for(int idx=0 ; idx<s.length() ; idx += 2*k) {
            int i = idx;
            int j = Math.min(i+k-1, s.length()-1);

            while(i < j) {
                char c = data.charAt(i);
                data.setCharAt(i++, data.charAt(j));
                data.setCharAt(j--, c);
            }
        }

        return data.toString();
    }
}
