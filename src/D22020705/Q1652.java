package D22020705;

import java.util.Arrays;

/**
 * 1652. Defuse the Bomb
 */
public class Q1652 {

    public int[] decrypt(int[] code, int k) {

        if(k == 0) return new int[code.length];

        int[] result = new int[code.length];
        int s = k > 0 ? 1 : code.length + k;    //초기 index 설정!
        int e = k > 0 ? k : code.length - 1;    //초기 index 설정!
        int sum = 0;

        for(int i=s ; i<=e ; i++) sum += code[i];
        for(int i=0 ; i<code.length ; i++) {
            result[i] = sum;

            sum -= code[s];
            s = (s+1) % code.length;
            e = (e+1) % code.length;
            sum += code[e];
        }

        return result;
    }
}
