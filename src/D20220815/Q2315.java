package D20220815;

/**
 * 2315. Count Asterisks
 */
public class Q2315 {

    public int countAsterisks(String s) {

        boolean add = true;
        int count = 0;
        int result = 0;

        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) == '*' && add) result++;
            else if(s.charAt(i) == '|') count++;
            add = count % 2 != 1;
        }

        return result;
    }
}
