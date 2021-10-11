package D20211011;

/**
 * 482. License Key Formatting
 */
public class Q0482 {

    public String licenseKeyFormatting(String s, int k) {

        char[] data = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        int idx = s.length() - 1;
        int count = 0;

        while(idx > -1) {
            if(data[idx] == '-' && count<k) {
                idx--;
                continue;
            }

            sb.append(Character.toUpperCase(data[idx--]));
            count++;

            if(count == k) {
                sb.append('-');
                count = 0;
            }
        }

        if(sb.length() > 0 && sb.charAt(sb.length()-1) == '-') sb.deleteCharAt(sb.length()-1);

        return sb.reverse().toString();
    }
}
