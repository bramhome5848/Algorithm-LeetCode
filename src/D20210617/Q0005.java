package D20210617;

/**
 * 5. Longest Palindromic Substring
 */
public class Q0005 {

    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;

        int[] bef = new int[2]; //[0] start position, [1] length

        for(int i=0 ; i<s.length() ; i++) {
            bef = getPalindrome(s, i, i, bef); //odd
            bef = getPalindrome(s, i, i+1, bef);  //even
        }
        return s.substring(bef[0], bef[0]+bef[1]);
    }

    public int[] getPalindrome(String s, int left, int right, int[] bef) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if(bef[1] < right-left-1) {
            bef[0] = left+1;    //start position update
            bef[1] = right-left-1;  //length update
        }
        return bef;
    }
}
