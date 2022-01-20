package D20220120;

import java.util.ArrayList;
import java.util.List;

/**
 * 1560. Most Visited Sector in a Circular Track
 */
public class Q1560 {

    public List<Integer> mostVisited(int n, int[] rounds) {

        List<Integer> result = new ArrayList<>();
        int start = rounds[0];
        int end = rounds[rounds.length - 1];

        //한 바퀴를 돌면 다 같이 1씩 늘어남
        //중복되는 것들 제외 가장 많은 것이 답

        if(start <= end) {
            for(int i=start ; i <end+1 ; i++) result.add(i);
        } else {
            for(int i=1 ; i<end+1 ; i++) result.add(i);
            for(int i=start ; i<n+1 ; i++) result.add(i);
        }
        return result;
    }
}
