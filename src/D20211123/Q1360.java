package D20211123;

/**
 * 1360. Number of Days Between Two Dates
 */
public class Q1360 {

    private static int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(fromS(date1) - fromS(date2));
    }

    private int fromS(String date) {
        String[] data = date.split("-");

        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[2]);

        for (int i=1971 ; i<year ; i++) day += (isLeapYear(i)) ? 366 : 365;
        for (int i=0 ; i<month-1 ; i++) day += months[i];
        if (month > 2 && isLeapYear(year)) day += 1;
        return day;
    }
    private boolean isLeapYear(Integer year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
}
