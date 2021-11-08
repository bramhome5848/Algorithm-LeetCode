package D20211108;

/**
 * 824. Goat Latin
 */
public class Q0824 {

    public String toGoatLatin(String sentence) {

        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        int r = 1;

        for(String word : words){
            char ch = word.charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                sb.append(word).append("ma").append("a".repeat(r++)).append(" ");
            else
                sb.append(word.substring(1)).append(word.charAt(0)).append("ma").append("a".repeat(r++)).append(" ");
        }

        return sb.toString().trim();
    }
}
