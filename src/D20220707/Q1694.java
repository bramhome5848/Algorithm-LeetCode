package D20220707;

/**
 * 1694. Reformat Phone Number
 */
public class Q1694 {

    public String reformatNumber(String number) {

        number = number.replaceAll("[ -]","");
        StringBuilder result = new StringBuilder();

        while(number.length() > 4) {
            result.append(number, 0, 3).append('-');
            number = number.substring(3);
        }

        if(number.length() == 4) {
            result.append(number, 0, 2).append('-').append(number.substring(2));
        } else {
            result.append(number);
        }

        return result.toString();
    }
}
