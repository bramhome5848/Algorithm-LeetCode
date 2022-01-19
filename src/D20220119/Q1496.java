package D20220119;

import java.util.*;

/**
 * 1496. Path Crossing
 */
public class Q1496 {

    public boolean isPathCrossing1(String path) {

        Set<String> trace = new HashSet<>();
        int x = 0;
        int y = 0;

        trace.add(x + " " + y);

        for(char c : path.toCharArray()) {

            if(c == 'N') y++;
            else if(c == 'S') y--;
            else if(c == 'E') x++;
            else x--;

            String key = x + " " + y;
            if(trace.contains(key)) return true;
            else trace.add(key);
        }

        return false;
    }

    public boolean isPathCrossing2(String path) {

        Map<Integer, Set<Integer>> trace = new HashMap<>();
        trace.put(0, new HashSet<>(List.of(0)));

        int x = 0;
        int y = 0;

        for (char c : path.toCharArray()) {

            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else x--;

            if (trace.containsKey(x)) {
                Set<Integer> set = trace.get(x);
                if (set.contains(y)) return true;
                else set.add(y);
            } else {
                trace.put(x, new HashSet<>(List.of(y)));
            }
        }

        return false;
    }
}
