package D20220119;


import java.util.Map;

/**
 * 1507. Reformat Date
 */
public class Q1507 {

    public static Map<String, String> month = Map.ofEntries(
            Map.entry("Jan", "01"),
            Map.entry("Feb", "02"),
            Map.entry("Mar", "03"),
            Map.entry("Apr", "04"),
            Map.entry("May", "05"),
            Map.entry("Jun", "06"),
            Map.entry("Jul", "07"),
            Map.entry("Aug", "08"),
            Map.entry("Sep", "09"),
            Map.entry("Oct", "10"),
            Map.entry("Nov", "11"),
            Map.entry("Dec", "12")
    );

    public String reformatDate(String date) {

        StringBuilder result = new StringBuilder();

        String[] reformat = date.split(" ");
        result.append(reformat[2]).append("-");
        result.append(month.get(reformat[1])).append("-");

        if(Character.isLetter(reformat[0].charAt(1))) result.append("0");

        result.append(reformat[0]);

        return result.substring(0, 10);
    }
}
