package D20210618;

/**
 * 13. Roman to Integer
 */
public class Q0013 {

    public int romanToInt(String s) {
        int result = 0;
        int i = 0;

        while(i < s.length()) {
            if(i + 1 == s.length()) return  result += getInt(s.charAt(i));

            if(s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                result += getInt(s.charAt(i + 1))- 1;
                i += 2;
            } else if(s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                result += getInt(s.charAt(i + 1)) - 10;
                i += 2;
            } else if(s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                result += getInt(s.charAt(i + 1)) - 100;
                i += 2;
            } else {
                result += getInt(s.charAt(i));
                i++;
            }
        }
        return result;
    }

    private int getInt(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
