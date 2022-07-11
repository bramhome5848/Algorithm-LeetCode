package D20220711;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * 1805. Number of Different Integers in a String
 */
public class Q1805 {

    public int numDifferentIntegers(String word) {

        String[] digit = word.split("[a-z]+");
        Set<BigInteger> set = new HashSet<>();

        for(String s : digit) {
            if(s.length() > 0) set.add(new BigInteger(s));
        }

        return set.size();
    }
}
