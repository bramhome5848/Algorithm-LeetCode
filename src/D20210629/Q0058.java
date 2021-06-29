package D20210629;

/**
 * 58. Length of Last Word
 */
public class Q0058 {

    public int lengthOfLastWord(String s) {
        String[] data = s.split(" ");
        return data.length == 0 ? 0 : data[data.length-1].length();
    }
}
