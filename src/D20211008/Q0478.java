package D20211008;

import java.util.Random;

/**
 * 478. Generate Random Point in a Circle
 */
public class Q0478 {
}

class Solution {

    private final Random random;
    private double radius;
    private double x_center;
    private double y_center;

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
        random = new Random();
    }

    public double[] randPoint() {

        double r = Math.sqrt(random.nextDouble()) * radius;
        double theta = random.nextDouble() * 2 * Math.PI;
        return new double[]{ x_center + r * Math.cos(theta), y_center + r * Math.sin(theta)};
    }
}