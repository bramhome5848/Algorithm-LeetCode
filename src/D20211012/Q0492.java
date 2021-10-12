package D20211012;

/**
 * 492. Construct the Rectangle
 */
public class Q0492 {

    public int[] constructRectangle(int area) {

        for(int i=(int)Math.sqrt(area) ; i>0 ; i--) {
            if(area%i == 0) return new int[]{area/i, i};
        }

        return new int[]{};
    }
}
