package D20210805;

import java.util.HashMap;
import java.util.Map;

/**
 * 299. Bulls and Cows
 */
public class Q0299 {

    public String getHint(String secret, String guess) {

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapG = new HashMap<>();

        int strike = 0;
        int ball = 0;

        for(int i=0 ; i<secret.length() ; i++) {
            if(secret.charAt(i) == guess.charAt(i)) strike++;
            else {
                mapS.merge(secret.charAt(i), 1, Integer::sum);
                mapG.merge(guess.charAt(i), 1, Integer::sum);
            }
        }

        for(char c : mapS.keySet()) {
            if(mapG.containsKey(c)) {
                ball += Math.min(mapS.get(c), mapG.get(c));
            }
        }

        return strike + "A" + ball + "B";
    }
}
