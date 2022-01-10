package D20220110;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1436. Destination City
 */
public class Q1436 {

    public String destCity(List<List<String>> paths) {

        Map<String, String> data = new HashMap<>();

        for(List<String> path : paths) data.put(path.get(0), path.get(1));
        Set<String> set = paths.stream().flatMap(Collection::stream).collect(Collectors.toSet());

        for(String s : set) {
           if(data.get(s) == null) return s;
        }

        return "";
    }
}
