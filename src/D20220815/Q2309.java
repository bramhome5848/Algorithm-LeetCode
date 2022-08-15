package D20220815;

/**
 * 2309. Greatest English Letter in Upper and Lower Case
 */
public class Q2309 {

    public String greatestLetter(String s) {

        int[] freqA = new int[26];
        int[] freqB = new int[26];

        for(char c : s.toCharArray()) {
            if(Character.isLowerCase(c)) freqA[c - 'a']++;
            else freqB[c - 'A']++;
        }

        for(int i=25 ; i>-1 ; i--) {
            if(freqA[i] > 0 && freqB[i] > 0) return Character.toString((char)('A' + i));
        }

        return "";
    }
}
