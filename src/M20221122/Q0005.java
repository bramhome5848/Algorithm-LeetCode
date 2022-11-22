package M20221122;

/**
 * 5. Longest Palindromic Substring
 */
public class Q0005 {

    public String longestPalindrome(String s) { //Palindrome -> 양쪽으로 같은것이 존재하는지 확인
        int[] bef = new int[2];

        for(int i=0 ; i<s.length() ; i++) {
            bef = getPalindrome(s, i, i, bef);
            bef = getPalindrome(s, i, i+1, bef);
        }

        return s.substring(bef[0], bef[1]);
    }
    private int[] getPalindrome(String s, int left, int right, int[] bef) {
        //Palindrome
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        //[left + 1] ~ [right - 1] -> Palindrome
        if(bef[1] - bef[0] < right - left) {
            bef[0] = left + 1;
            bef[1] = right;
        }

        return bef;
    }
}
