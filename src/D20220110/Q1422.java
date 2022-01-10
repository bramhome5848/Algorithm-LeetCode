package D20220110;

/**
 * 1422. Maximum Score After Splitting a String
 */
public class Q1422 {

    public int maxScore(String s) {

        int left = 0;
        int right = (int) s.chars().filter(c -> c == '1').count();
        int result = 0;

        for(int i=1 ; i<s.length()-1 ; i++) {
            if(s.charAt(i) == '0') left++;
            else right--;

            result = Math.max(result, left + right);
        }

        return result;
    }
}
