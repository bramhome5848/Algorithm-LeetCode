package D20210818;

public class Q0365 {

    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(jug1Capacity + jug2Capacity < targetCapacity) return false;
        return targetCapacity % getGcd(jug1Capacity, jug2Capacity) == 0;
    }

    // 최대공약수
    private int getGcd(int a, int b) {
        if (a % b == 0) return b;
        return getGcd(b, a%b);
    }
}
