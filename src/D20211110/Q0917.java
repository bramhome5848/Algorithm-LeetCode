package D20211110;

/**
 * 917. Reverse Only Letters
 */
public class Q0917 {

    public String reverseOnlyLetters(String s) {

        int i = 0;
        int j = s.length()-1;
        char[] data = s.toCharArray();

        while(i < j) {
            if(Character.isLetter(data[i]) && Character.isLetter(data[j])) {
                char temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;
            } else if(!Character.isLetter(data[i])) i++;
            else j--;
        }
        return new String(data);
    }
}
