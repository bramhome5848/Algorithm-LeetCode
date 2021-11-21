package D20211121;

import java.util.ArrayList;
import java.util.List;

/**
 * 1260. Shift 2D Grid
 */
public class Q1260 {


    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> data = new ArrayList<>();

        int n = grid.length;
        int m = grid[0].length;

        for(int[] pair : grid) {
            for(int value : pair) {
                data.add(value);
            }
        }

        while(k-- > 0){
            int temp = data.get(data.size() - 1);
            for(int i=data.size()-1 ; i>0 ; i--) data.set(i, data.get(i-1));
            data.set(0, temp);
        }

        for(int i=0 ; i<n*m ; i+=m) result.add(data.subList(i, i+m));

        return result;
    }
}
