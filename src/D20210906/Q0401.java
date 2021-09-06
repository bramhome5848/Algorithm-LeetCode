package D20210906;

import java.util.ArrayList;
import java.util.List;

/**
 * 401. Binary Watch
 */
public class Q0401 {

    public List<String> readBinaryWatch(int turnedOn) {

        List<String> result = new ArrayList<>();

        //hours (0-11)
        //minutes (0-59)
        for(int i=0 ; i<12 ; i++) {
            for(int j=0 ; j<60 ; j++) {
                if(hDist(i) + hDist(j) == turnedOn) {
                    result.add(String.format("%d:%02d", i, j));
                }
            }
        }

        return result;
    }

    /**
     * bit 가 1인 경우 세기 -> stream
     */
    private int hDist(int num) {
        return (int) Integer.toBinaryString(num).chars().filter(s -> s == 49).count();
    }

    /**
     * bit 가 1인 경우 세기 -> bit 계산
     */
    private int hDist2(int num) {
        int count = 0;

        while(num != 0) {
            num &= num - 1;
            count++;
        }

        return count;
    }

}
