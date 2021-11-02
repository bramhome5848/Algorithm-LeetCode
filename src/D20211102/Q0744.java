package D20211102;

/**
 * 744. Find Smallest Letter Greater Than Target
 */
public class Q0744 {

    public char nextGreatestLetter(char[] letters, char target) {

        for(char letter : letters) if(target < letter) return letter;
        return letters[0];
    }
}
