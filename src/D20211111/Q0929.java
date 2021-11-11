package D20211111;

import java.util.HashSet;
import java.util.Set;

/**
 * 929. Unique Email Addresses
 */
public class Q0929 {

    public int numUniqueEmails1(String[] emails) {

        Set<String> result = new HashSet<>();

        for(String email : emails) {
           String[] data = email.split("@");

           int idx = data[0].indexOf('+');
           if(idx != -1) data[0] = data[0].substring(0, idx);

           data[0] = data[0].replaceAll("\\.", "");
           result.add(data[0]+"@"+data[1]);
        }
        return result.size();
    }

    public int numUniqueEmails2(String[] emails) {

        Set<String> result = new HashSet<>();

        for(String email : emails) {
            String[] data = email.split("@");
            data[0] = data[0].replaceAll("\\.", "");
            result.add(data[0].split("\\+")[0] + "@" + data[1]);
        }

        return result.size();
    }
}
