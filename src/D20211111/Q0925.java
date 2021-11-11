package D20211111;

/**
 * 925. Long Pressed Name
 */
public class Q0925 {

    public boolean isLongPressedName(String name, String typed) {

        if(typed.length() < name.length()) return false;
        if(name.equals(typed)) return true;

        int i = 0;
        int j = 0;

        while(j < typed.length()) {
            if(i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if(j > 0 && typed.charAt(j) == typed.charAt(j-1)) j++;
            else return false;
        }

        return i == name.length();
    }
}
