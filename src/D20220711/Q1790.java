package D20220711;

import java.util.Arrays;

/**
 * 1790. Check if One String Swap Can Make Strings Equal
 */
public class Q1790 {

    public boolean areAlmostEqual(String s1, String s2) {

        int idx1 = -1;
        int idx2 = -1;
        char[] arr = s1.toCharArray();

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] != s2.charAt(i)) {
                if(idx1 == -1) idx1 = i;
                else if(idx2 == -1) idx2 = i;
                else return false;
            }
        }

        if(idx1 == -1) return true;
        if(idx2 == -1) return false;

        char c = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = c;

        return String.valueOf(arr).equals(s2);
    }
}
