package D20210722;

import java.util.HashMap;
import java.util.Map;

/**
 * 166. Fraction to Recurring Decimal
 */
public class Q0166 {

    public String fractionToDecimal(int numerator, int denominator) {

        if(numerator == 0 || denominator == 0) return "0";

        StringBuilder sb = new StringBuilder();
        long x = Math.abs((long) numerator);
        long y = Math.abs((long) denominator);
        long remainder = x % y;

        if((numerator < 0 && denominator > 0) || (numerator > 0 && denominator <0)){
            sb.append("-");
        }

        sb.append(x / y);
        if(remainder == 0) return sb.toString();

        //remain, position
        Map<Integer, Integer> map = new HashMap<>();
        sb.append(".");

        while(remainder != 0) {

            if(map.containsKey((int)remainder)) {
                sb.insert(map.get((int)remainder), "(");
                sb.append(")");
                return sb.toString();
            }
            map.put((int)remainder, sb.length());
            remainder = remainder * 10;
            sb.append(remainder / y);
            remainder = remainder % y;
        }

        return sb.toString();
    }
}
