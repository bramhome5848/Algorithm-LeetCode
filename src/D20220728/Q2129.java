package D20220728;

/**
 * 2129. Capitalize the Title
 */
public class Q2129 {

    public String capitalizeTitle(String title) {

        StringBuilder result = new StringBuilder();
        String[] words = title.toLowerCase().split(" ");

        for(String word : words) {
            if(word.length() < 3) result.append(word);
            else result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));

            result.append(' ');
        }

        return result.toString().trim();
    }
}
