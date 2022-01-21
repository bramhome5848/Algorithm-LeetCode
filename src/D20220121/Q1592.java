package D20220121;

/**
 * 1592. Rearrange Spaces Between Words
 */
public class Q1592 {

    public String reorderSpaces(String text) {

        String[] words = text.trim().split("\\s+");
        StringBuilder result = new StringBuilder(words[0]);
        int space = 0;

        for(char c : text.toCharArray()) {
           if(c == ' ') space++;
        }

        if (words.length == 1) return result.append(" ".repeat(space)).toString();

        for(int i=1 ; i<words.length ; i++) {
            result.append(" ".repeat(space / (words.length - 1))).append(words[i]);
        }

        return result.append(" ".repeat(space % (words.length - 1))).toString();
    }
}
