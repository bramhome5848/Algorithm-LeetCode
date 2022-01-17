package D20220117;

/**
 * 1450. Number of Students Doing Homework at a Given Time
 */
public class Q1450 {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int result = 0;

        for(int i=0 ; i<startTime.length ; i++) {
            if(startTime[i] <= queryTime && queryTime <= endTime[i]) result++;
        }

        return result;
    }
}
