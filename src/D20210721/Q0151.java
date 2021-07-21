package D20210721;

/**
 * 151. Reverse Words in a String
 */
public class Q0151 {

    public String reverseWords(String s) {

        String[] data = s.trim().split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=data.length-1 ; i>-1 ; i--) {
            if(!data[i].isEmpty()) {
                result.append(data[i]).append(" ");
            }
        }

        result.setLength(result.length() - 1);
        //result.deleteCharAt(result.length()- 1 );
        return result.toString();
    }
}
