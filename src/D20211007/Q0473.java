package D20211007;

import java.util.Arrays;

/**
 * 473. Matchsticks to Square
 */
public class Q0473 {

    public boolean makesquare(int[] matchsticks) {

        if (matchsticks == null || matchsticks.length < 4) return false;

        int sum = Arrays.stream(matchsticks).sum();

        if(sum%4 != 0) return false;
        int side = sum/4;

        return dfs(0, 0, 0, 0, matchsticks, 0, side);
    }

    private boolean dfs(int s1, int s2, int s3, int s4, int[] matchsticks, int idx, int length) {

        if (s1 > length || s2 > length || s3 > length || s4 > length) return false;
        if (idx == matchsticks.length) return s1 == s2 && s2 == s3 && s3 == s4;

        return (dfs(s1+matchsticks[idx], s2, s3, s4, matchsticks, idx+1, length)) ||
                (dfs(s1, s2+matchsticks[idx], s3, s4, matchsticks, idx+1, length)) ||
                (dfs(s1, s2, s3+matchsticks[idx], s4, matchsticks, idx+1, length)) ||
                (dfs(s1, s2, s3, s4+matchsticks[idx], matchsticks, idx+1, length));
    }
}
