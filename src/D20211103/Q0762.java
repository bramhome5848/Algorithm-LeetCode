package D20211103;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 762. Prime Number of Set Bits in Binary Representation
 */
public class Q0762 {

    private final Set<Integer> set = new HashSet<>(List.of(2, 3, 5, 7, 11, 13, 17, 19));

    public int countPrimeSetBits1(int left, int right) {

        int result = 0;

        for(int i=left ; i<right+1 ; i++) {
            String value = Integer.toBinaryString(i);
            int count = 0;
            for(char c : value.toCharArray()) if(c == '1') count++;

            if(set.contains(count)) result++;
        }

        return result;
    }

    public int countPrimeSetBits2(int left, int right) {

        int result = 0;
        for(int i=left ; i<right+1 ; i++) {
            int num = i;
            int bit = 0;

            while(num != 0) {
                num &= num-1;
                bit++;
            }

            if(set.contains(bit)) result++;
        }

        return result;
    }
}
