package D20220713;

/**
 * 1844. Replace All Digits with Characters
 */
public class Q1844 {

    public String replaceDigits(String s) {

        char[] arr = s.toCharArray();

        for(int i=0 ; i<arr.length ; i++) {
            if(Character.isDigit(arr[i])) {
                arr[i] = (char)(arr[i-1] + (arr[i] - '0'));
            }
        }

        return String.valueOf(arr);
    }
}
