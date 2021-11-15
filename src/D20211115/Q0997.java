package D20211115;


/**
 * 997. Find the Town Judge
 */
public class Q0997 {

    public int findJudge(int n, int[][] trust) {

        int[] result = new int[n+1];

        for(int[] person : trust) {
            result[person[0]]--;
            result[person[1]]++;
        }

        for(int i=1 ; i<n+1 ; i++) {
            if(result[i] == n-1) return i;
        }

        return -1;
    }
}
