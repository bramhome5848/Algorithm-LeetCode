package D20210908;

/**
 * 415. Add Strings
 */
public class Q0415 {

    //1 <= num1.length, num2.length <= 10000
    public String addStrings(String num1, String num2) {

        StringBuilder result = new StringBuilder();

        int idx1 = num1.length() - 1;
        int idx2 = num2.length() - 1;
        int carry = 0;

        while (idx1 >= 0 || idx2 >= 0) {
            int sum = carry;
            if(idx1 >= 0) sum += num1.charAt(idx1--) - '0';
            if(idx2 >= 0) sum += num2.charAt(idx2--) - '0';

            result.append(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) result.append(carry);

        return result.reverse().toString();
    }
}
