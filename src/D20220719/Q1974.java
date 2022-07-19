package D20220719;

/**
 * 1974. Minimum Time to Type Word Using Special Typewriter
 */
public class Q1974 {

    public  int minTimeToType(String word) {

        int result = 0;
        char bef = 'a';

        for(char c : word.toCharArray()) {
            int diff = Math.abs(bef - c);
            result += Math.min(diff, 26 - diff) + 1;
            bef = c;
        }

        return result;
    }
}
