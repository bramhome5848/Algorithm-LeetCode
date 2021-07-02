package D20210702;

import java.util.ArrayList;
import java.util.List;

/**
 * 93. Restore IP Addresses
 */
public class Q0093 {

    public List<String> restoreIpAddresses(String s) {

        if(s.length() < 4 || 12 < s.length()) return new ArrayList<>();

        List<String> result = new ArrayList<>();
        getIPAddress(0, 0, result, new ArrayList<>(), s);
        return result;
    }

    public void getIPAddress(int index, int length,
                             List<String> result, List<String> sub, String s) {

        if(sub.size() > 4 && length > s.length()) return;

        if(sub.size() == 4 && length == s.length()) {
            result.add(String.join(".", sub));
            return;
        }

        for(int i=1 ; i<4 ; i++) {
            if(index + i > s.length()) break;
            String value = s.substring(index, index+i);

            if(isValid(value)) {
                sub.add(value);
                getIPAddress(index+i, length + value.length(), result, sub, s);
                sub.remove(sub.size()-1);
            }
        }
    }

    public boolean isValid(String s) {
        if(s.length() > 1 && s.startsWith("0")) return false;
        return Integer.parseInt(s) <= 255;
    }
}

