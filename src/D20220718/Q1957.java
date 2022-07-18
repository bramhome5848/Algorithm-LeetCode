package D20220718;

/**
 * 1957. Delete Characters to Make Fancy String
 */
public class Q1957 {

    public String makeFancyString1(String s) {

        if(s.length() <= 2) return s;

        StringBuilder result = new StringBuilder();
        char c1 = s.charAt(0);
        char c2 = s.charAt(1);

        result.append(c1).append(c2);

        for(int i=2 ; i<s.length() ; i++) {
            if(s.charAt(i) == c1 && s.charAt(i) == c2) continue;

            c1 = c2;
            c2 = s.charAt(i);
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    public String makeFancyString2(String s) {

        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(result.length() <= 1 || result.charAt(result.length() - 1) != c || result.charAt(result.length() - 2) != c) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
