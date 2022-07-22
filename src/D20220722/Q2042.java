package D20220722;

/**
 * 2042. Check if Numbers Are Ascending in a Sentence
 */
public class Q2042 {

    public boolean areNumbersAscending(String s) {

        String[] numberStrings = s.replaceAll("[^0-9]+", " ").trim().split(" ");
        int prev = -1;

        for(String numberString : numberStrings) {
            int num = Integer.parseInt(numberString);
            if(num <= prev) return false;
            prev = num;
        }

        return true;
    }
}
