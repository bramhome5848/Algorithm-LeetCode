package D20220726;

/**
 * 2078. Two Furthest Houses With Different Colors
 */
public class Q2078 {

    public int maxDistance(int[] colors) {

        int i = 0;
        int j = colors.length - 1;

        while(colors[0] == colors[j]) j--;
        while(colors[colors.length-1] == colors[i]) i++;
        return Math.max(colors.length - 1 - i, j);
    }
}
