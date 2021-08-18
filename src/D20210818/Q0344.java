package D20210818;

/**
 * 344. Reverse String
 */
public class Q0344 {

    //not allocate extra space for another array
    //must do this by modifying the input array in-place with O(1) extra memory
    public void reverseString(char[] s) {

        char temp;
        for(int i=s.length/2-1 ; i>-1 ; i--) {
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
}
