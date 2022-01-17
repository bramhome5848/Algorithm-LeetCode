package D20220117;

/**
 * 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */
public class Q1455 {

    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] splits = sentence.split(" ");

        for(int i=0 ; i<splits.length ; i++) {
            if(splits[i].startsWith(searchWord)) return i+1;
        }

        return -1;
    }
}
