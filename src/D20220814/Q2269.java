package D20220814;

/**
 * 2269. Find the K-Beauty of a Number
 */
public class Q2269 {

    public int divisorSubstrings(int num, int k) {

        if(Math.log10(num) + 1 == k) return 1;

        String data = String.valueOf(num);
        int result = 0;

        for(int i=0 ; i<data.length()-k+1 ; i++) {
            int value = Integer.parseInt(data.substring(i, i+k));
            if(value != 0 && num % value == 0) result++;
        }

        return result;
    }
}
