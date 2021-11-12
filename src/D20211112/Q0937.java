package D20211112;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * 937. Reorder Data in Log Files
 */
public class Q0937 {

    public String[] reorderLogFiles(String[] logs) {

        List<String> digit = new ArrayList<>();
        List<String[]> ret = new ArrayList<>();

        for(String log : logs) {
           int idx = log.indexOf(' ');
            String key = log.substring(0, idx);
            String content = log.substring(idx + 1);

            if(Character.isDigit(content.charAt(0))) digit.add(log);
            else ret.add(new String[]{key, content});
        }

        List<String> result = ret.stream()
                .sorted((r1, r2) -> r1[1].equals(r2[1]) ?
                        r1[0].compareTo(r2[0]) : r1[1].compareTo(r2[1]))
                .map(r -> r[0] + ' ' + r[1]).collect(Collectors.toList());

        result.addAll(digit);
        return result.toArray(String[]::new);
    }
}
