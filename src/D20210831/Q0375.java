package D20210831;

/**
 * 375. Guess Number Higher or Lower II
 */
public class Q0375 {

    public int getMoneyAmount1(int n) {

        if(n <= 1) return 0;

        //result[i][j] -> i ~ j 범위의 수에서 k를 선택 했을 때
        //발생할 수 있는 비용의 최대값들 중에서 가장 적은 값
        int[][] result = new int[n+1][n+1];
        return getResult(1, n, result);
    }

    private int getResult(int start, int end, int[][] result) {

        if(start >= end) return 0;
        if(result[start][end] != 0) return result[start][end];

        int min = Integer.MAX_VALUE;

        for(int i=start ; i<end+1 ; i++) {
            int cost = i;
            cost += Math.max(getResult(start, i-1, result), getResult(i+1, end, result));
            min = Math.min(min, cost);
        }

        result[start][end] = min;
        return min;
    }

    //bottom-up 으로 풀어보기
    public int getMoneyAmount2(int n) {

        if(n <= 1) return 0;
        int[][] result = new int[n+1][n+1];

        for (int i=1 ; i<n ; i++) {
            for (int j=0 ; i+j<=n ; j++) {
                int end = i+j;
                result[j][end] = Integer.MAX_VALUE;
                for (int k=j; k<end+1 ; k++) {
                    result[j][end] = Math.min(result[j][end],
                            k + Math.max(j <= k-1 ? result[j][k-1] : 0, k+1 <= end ? result[k+1][end] : 0));
                }
            }
        }
        return result[1][n];
    }
}
