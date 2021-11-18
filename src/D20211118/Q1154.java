package D20211118;

/**
 * 1154. Day of the Year
 */
public class Q1154 {

    static int[] daysSum = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public int dayOfYear1(String date) {

        String[] data = date.split("-");
        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[2]);
        int sum = daysSum[month-1] + day;

        if(month < 3) return sum;

        return (year % 400 == 0) || (year % 100 == 0) || (year % 4 == 0) ? sum+1 : sum;
    }

    public int dayOfYear2(String date) {

        char[] digits = date.toCharArray();

        int year = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3] - 53328;
        int month = digits[5] * 10 + digits[6] - 529;
        int extra = (month > 1) && ((year % 400 == 0) || (year % 100 == 0) || (year % 4 == 0)) ? 1 : 0;
        return digits[8] * 10 + digits[9] - 528 + daysSum[month] + extra;
    }


}
