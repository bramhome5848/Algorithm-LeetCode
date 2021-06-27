package D20210627;

/**
 * 43. Multiply Strings
 */
public class Q0043 {

    public String multiply(String num1, String num2) {

        StringBuilder sb = new StringBuilder();
        int[] result = new int[num1.length() + num2.length()];

        int p1 = 0;
        int p2 = 0;

        for(int i=num1.length()-1 ; i>-1 ; i--) {

            int carry = 0;
            int x = num1.charAt(i) - '0';
            p2 = 0;

            for(int j=num2.length()-1 ; j>-1 ; j--) {
                int y = num2.charAt(j) - '0';
                int sum = x * y + carry + result[p1+p2];
                carry = sum/10;
                result[p1+p2] = sum%10;
                p2++;
            }

            if(carry > 0) result[p1 + p2] += carry;
            p1++;
        }

        p1 = p1 + p2 - 1;
        while(p1 > 0 && result[p1] == 0) p1--;
        while(p1 >= 0) sb.append(result[p1--]);

        return sb.toString();
    }
}
