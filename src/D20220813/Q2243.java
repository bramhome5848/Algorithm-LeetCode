package D20220813;

/**
 * 2243. Calculate Digit Sum of a String
 */
public class Q2243 {

    public String digitSum(String s, int k) {

        while(s.length() > k) {
            StringBuilder sb = new StringBuilder();
            int sum  = 0;
            int count = 0;

            for(char c : s.toCharArray()) {
                sum += c - '0';
                count++;

                if(count == k) {
                    sb.append(sum);
                    sum = 0;
                    count = 0;
                }
            }

            if(count != 0) sb.append(sum);
            s = sb.toString();
        }

        return s;
    }
}
