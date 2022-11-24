package M20221124;

/**
 * 11. Container With Most Water
 */
public class Q0011 {

    public int maxArea(int[] height) {

        int fIdx = 0;
        int eIdx = height.length - 1;
        int result = 0;

        while(fIdx < eIdx){
            result = Math.max(result, (eIdx - fIdx) * Math.min(height[fIdx], height[eIdx]));

            //높이가 낮은쪽이 더 커질 수 있으면 더 넓은 면적이 가능
            if(height[fIdx] < height[eIdx]) fIdx++;
            else eIdx--;
        }
        return result;
    }
}
