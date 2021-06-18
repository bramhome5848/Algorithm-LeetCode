package D20210618;

/**
 * 12. Integer to Roman
 */
public class Q0012 {

    public String intToRoman(int num) {

        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(num > 0) {
            int unitNum = num / value[i];
            for(int k=0; k<unitNum; ++k) {
                sb.append(roman[i]);
            }
            num -= unitNum * value[i];
            i++;
        }

        return sb.toString();
    }
}
