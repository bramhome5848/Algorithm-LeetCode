package D20211118;

import java.time.LocalDate;

/**
 * 1185. Day of the Week
 */
public class Q1185 {

    public String dayOfTheWeek1(int day, int month, int year) {

        LocalDate dt = LocalDate.of(year, month, day);
        String s =dt.getDayOfWeek().toString();
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public String dayOfTheWeek2(int day, int month, int year) {

        String[] arr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        return arr[d];
    }


}
