package D20210706;

/**
 * 125. Valid Palindrome
 */
public class Q0125 {

    public static boolean isPalindrome1(String s) {

        if(s.length() < 2) return true;

        String data = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(data.length() < 2) return true;

        for(int i=data.length()/2 ; i>-1 ; i--) {
            if(data.charAt(i) != data.charAt(data.length()-1-i)) return false;
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        String data = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return new StringBuilder(data).reverse().toString().equals(data);
    }
}
