package D20210617;

public class Q0009 {

    public boolean isPalindrome(int x) {
        char[] data = String.valueOf(x).toCharArray();
        int n = data.length/2;

        for(int i=data.length-1-n ; i>-1 ; i--) {
            if(data[i] != data[data.length-1-i]) return false;
        }

        return true;
    }
}
