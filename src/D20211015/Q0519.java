package D20211015;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 519. Random Flip Matrix
 */
public class Q0519 {
}

class Solution {

    private int rows;
    private int cols;
    private int total;
    private Random random;
    private Set<Integer> available;

    public Solution(int m, int n) {
        this.rows = m;
        this.cols = n;
        total = this.rows * this.cols;
        this.random = new Random();
        available = new HashSet<>();
    }

    public int[] flip() {
        int x = random.nextInt(this.total);

        while(available.contains(x)) {
            x = random.nextInt(this.total);
        }

        this.available.add(x);
        return new int[]{x/this.cols, x%this.cols};
    }

    public void reset() {
        this.available.clear();
    }
}