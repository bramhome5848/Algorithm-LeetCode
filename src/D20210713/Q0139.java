package D20210713;

import java.util.List;

/**
 * 139. Word Break
 */
public class Q0139 {

    public boolean wordBreak(String s, List<String> wordDict) {

        int[] result = new int[s.length()];

        for(int i=0 ; i<s.length() ; i++) {
            for(int j=0 ; j<i+1 ; j++) {
                String sub = s.substring(j, i+1);
                if(wordDict.contains(sub)) {
                    if(j>0) result[i] += result[j-1];
                    else result[i] += 1;
                }
            }
        }
        return result[s.length()-1] > 0;
    }
}
