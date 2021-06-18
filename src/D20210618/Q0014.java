package D20210618;

/**
 * 14. Longest Common Prefix
 */
public class Q0014 {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLength = 201;

        for(String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        main:
        for(int i=0 ; i<minLength; i++) {
            for(int j=1 ; j<strs.length ; j++) {
                if(strs[j].charAt(i) != strs[0].charAt(i)) break main;
            }
            sb.append(strs[0].charAt(i));
        }

        return sb.toString();
    }
}
