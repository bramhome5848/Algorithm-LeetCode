package D20211112;

/**
 * 942. DI String Match
 */
public class Q0942 {

    public int[] diStringMatch(String s) {

        int[] result = new int[s.length()+1];
        int min = 0;
        int max = result.length-1;

        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) == 'I') result[i] = min++;
            else result[i] = max--;
        }

        result[result.length-1] = min;
        return result;
    }
}
