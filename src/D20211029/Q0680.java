package D20211029;

/**
 * 680. Valid Palindrome II
 */
public class Q0680 {

    public boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return isPalindrome(start+1, end, s)
                        || isPalindrome(start , end-1, s);
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean isPalindrome(int start, int end, String s) {

        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}
