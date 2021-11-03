package D20211103;

/**
 * 812. Largest Triangle Area
 */
public class Q0812 {

    public double largestTriangleArea(int[][] points) {

        double result = 0;

        for(int i=0 ; i<points.length-2 ; i++) {
            for(int j=i+1 ; j<points.length-1 ; j++) {
                for(int k=j+1 ; k<points.length ;k++) {
                    result = Math.max(result, getArea(points[i], points[j], points[k]));
                }
            }
        }

        return result;
    }

    private double getArea(int[] a, int[] b, int[] c){
        double t = (a[0] * (b[1] - c[1]) - b[0] * (a[1] - c[1]) + c[0] * (a[1] - b[1])) / 2.0;
        return t > 0 ? t : -t;
    }
}
