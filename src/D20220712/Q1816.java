package D20220712;

/**
 * 1816. Truncate Sentence
 */
public class Q1816 {

    public String truncateSentence1(String s, int k) {

        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0 ; i<k ; i++) result.append(arr[i]).append(' ');
        result.setLength(result.length() - 1);

        return result.toString();
    }

    public String truncateSentence2(String s, int k) {

        int count = 0;

        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) == ' ') count++;
            if(count == k) {
                s = s.substring(0, i);
                break;
            }
        }

        return s;
    }
}
