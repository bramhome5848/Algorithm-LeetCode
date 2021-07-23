package D20210723;

/**
 * 168. Excel Sheet Column Title
 */
public class Q0168 {

    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0) {
            sb.append((char)(--columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}
