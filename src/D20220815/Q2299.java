package D20220815;

/**
 * 2299. Strong Password Checker II
 */
public class Q2299 {

    public boolean strongPasswordCheckerII(String password) {

        int countLow = 0;
        int countUpper = 0;
        int countDigit = 0;
        int countSpecial = 0;
        char bef = '[';

        for(char c : password.toCharArray()) {
            if(c == bef) return false;

            if(Character.isLowerCase(c)) countLow++;
            else if(Character.isUpperCase(c)) countUpper++;
            else if(Character.isDigit(c)) countDigit++;
            else countSpecial++;

            bef = c;
        }

        return password.length() >= 8 && countLow >= 1 && countUpper >= 1 && countDigit >= 1 && countSpecial >= 1;
    }
}
