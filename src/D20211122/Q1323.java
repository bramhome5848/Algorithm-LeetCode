package D20211122;

/**
 * 1323. Maximum 69 Number
 */
public class Q1323 {

    public int maximum69Number (int num) {

        char[] data = String.valueOf(num).toCharArray();

        for(int i=0 ; i<data.length ; i++) {
            if(data[i] == '6') {
                data[i] = '9';
                break;
            }
        }

        return Integer.parseInt(String.valueOf(data));
    }
}
