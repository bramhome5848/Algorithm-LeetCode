package D20210907;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 406. Queue Reconstruction by Height
 */
public class Q0406 {

    public int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, (p1, p2) -> p1[0]==p2[0] ? p1[1]-p2[1] : p2[0]-p1[0]);

        List<int[]> list = new ArrayList<>();
        for(int[] person : people) list.add(person[1], person);

        return list.toArray(new int[list.size()][]);
    }
}
