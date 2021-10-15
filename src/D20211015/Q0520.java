package D20211015;

/**
 * 520. Detect Capital
 */
public class Q0520 {

    public boolean detectCapitalUse(String word) {

        char[] data = word.toCharArray();
        int count = 0;

        for(char c : data) {
           if(Character.isUpperCase(c)) count++;
        }

        if(count == 1) {
            return Character.isUpperCase(data[0]);
        } else return count == data.length || count == 0;
    }
}
