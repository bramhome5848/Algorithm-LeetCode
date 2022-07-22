package D20220722;

/**
 * 2047. Number of Valid Words in a Sentence
 */
public class Q2047 {

    public int countValidWords(String sentence) {

        // regex
        // ^ -> starts with
        // [a-z] -> includes occur of lowercase letters
        // + -> one or more
        // ? -> zero or one
        // ( ) -> group
        // | -> or
        // $ -> ends with

        //[a-z]+ -> one or more lower case english letters
        //-? -> zero or one hyphen
        //(!|.|,)? -> zero or one of '!', '.' (need to use . for period) and ','. Could have also used [!.,]?
        //"[^0-9]+" -> this regex indicates that the string cannot have digits.

        String regex = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String numRegex = "[^0-9]+";
        String[] splitSentence = sentence.split("\\s+");
        int result = 0;

        for(String s : splitSentence) {
            if(s.matches(regex) && s.matches(numRegex)) result++;
        }

        return result;
    }
}
