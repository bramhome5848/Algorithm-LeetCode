package D20220704;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1629. Slowest Key
 */
public class Q1629 {

    public char slowestKey(int[] releaseTimes, String keysPressed) {

        Map<Character, Integer> freqMap = new HashMap<>();
        freqMap.put(keysPressed.charAt(0), releaseTimes[0]);

        for(int i=1 ; i<releaseTimes.length ; i++) {
            freqMap.put(keysPressed.charAt(i), Math.max(freqMap.getOrDefault(keysPressed.charAt(i), 0), releaseTimes[i] - releaseTimes[i-1]));
        }

        return freqMap.entrySet().stream()
                .sorted((f1, f2) -> f1.getValue().equals(f2.getValue()) ? f2.getKey() - f1.getKey() : f2.getValue() - f1.getValue())
                .limit(1).map(Map.Entry::getKey).collect(Collectors.toList()).get(0);
    }
}
