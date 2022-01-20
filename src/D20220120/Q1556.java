package D20220120;

/**
 * 1556. Thousand Separator
 */
public class Q1556 {

    public String thousandSeparator(int n) {

        if(n == 0) return "0";

        StringBuilder result = new StringBuilder();
        int count = 0;

        while(n != 0) {
            result.append(n % 10);
            n /= 10;
            count++;

            if(count == 3 && n != 0) {
                result.append('.');
                count = 0;
            }
        }

        return result.reverse().toString();
    }
}
