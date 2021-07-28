package D20210728;

/**
 *
 */
public class Q0223 {

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area = (ay2-ay1) * (ax2-ax1) + (by2-by1) * (bx2-bx1);
        int overlap = 0;

        if (bx1<ax2 && ax1<bx2  && by1<ay2 && ay1<by2) {
            overlap = (Math.min(bx2, ax2) - Math.max(bx1, ax1)) * (Math.min(by2, ay2) - Math.max(by1, ay1));
        }

        return area - overlap;
    }
}
