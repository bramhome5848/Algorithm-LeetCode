package D20210811;

/**
 * 319. Bulb Switcher
 */
public class Q0319 {
    /**
     * 1 round - 모든 전구 on
     * 2 round - 켜져 있는 것들 중에 round 번째 것을 off
     * ex) n == 6 -> 4round 이후 변화 없음
     * 1 round - on, on, on, on, on, on
     * 2 round - on, off,on, on, on, on
     * 3 round - on, off,on, off, on, on
     * 4 round - on, off,on, off, on, off
     * 5 round - on, off,on, off, on, off
     * 6 round - on, off,on, off, on, off
     */
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
