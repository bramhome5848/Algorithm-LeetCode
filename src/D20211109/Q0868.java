package D20211109;

/**
 *
 */
public class Q0868 {

    public int binaryGap(int n) {

        String binary = Integer.toBinaryString(n);
        int idx = binary.indexOf('1');
        int maxGap = 0;

        for(int i=idx+1 ; i<binary.length() ; i++) {
            if(binary.charAt(i) == '1') {
                maxGap = Math.max(maxGap, i-idx);
                idx = i;
            }
        }
        return maxGap;
    }
}
