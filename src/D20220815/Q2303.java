package D20220815;

/**
 * 2303. Calculate Amount Paid in Taxes
 */
public class Q2303 {

    public double calculateTax(int[][] brackets, int income) {

        double result = 0;
        int idx = 0;
        int prevTax = 0;
        int remain;

        while(income > 0) {
            remain = Math.min(income, brackets[idx][0] - prevTax);
            result += remain * brackets[idx][1] / 100.0;

            income -= remain;
            prevTax = brackets[idx++][0];
        }

        return result;
    }
}
