package D20220718;

/**
 * 1945. Sum of Digits of String After Convert
 */
public class Q1945 {
    public int getLucky(String s, int k) {

        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()) result.append(c - 'a' + 1);

        for(int i=0 ; i<k ; i++) {
            int value = 0;
            for(int j=0 ; j<result.length() ; j++) {
                value += result.charAt(j) - '0';
                System.out.println("value = " + value);
            }

            result.setLength(0);
            result.append(value);
        }

        return Integer.parseInt(result.toString());
    }
}
