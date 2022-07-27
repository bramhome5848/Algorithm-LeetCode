package D20220727;

/**
 * 2108. Find First Palindromic String in the Array
 */
public class Q2108 {

    public String firstPalindrome(String[] words) {

        for(String word : words) {
           if(isPalindrome(word)) return word;
        }

        return "";
    }

    private boolean isPalindrome(String word) {
        for(int i=word.length() / 2 ; i<word.length() ; i++) {
            if(word.charAt(i) != word.charAt(word.length()-1-i)) return false;
        }
        return true;
    }
}
