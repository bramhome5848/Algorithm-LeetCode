package D20210618;

/**
 * 11. Container With Most Water
 */
public class Q0011 {

    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int area = -1;

        while(i < j){
            int h = Math.min(height[i], height[j]);
            area = Math.max(area, (j-i) * h);

            if(height[i] < height[j]) i++;
            else j--;
        }
        return area;
    }
}
