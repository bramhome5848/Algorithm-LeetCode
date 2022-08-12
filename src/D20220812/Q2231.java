package D20220812;

import java.util.PriorityQueue;

/**
 * 2231. Largest Number After Digit Swaps by Parity
 */
public class Q2231 {

    public int largestInteger(int num) {

        PriorityQueue<Integer> even = new PriorityQueue<>((e1, e2) -> e2 - e1);
        PriorityQueue<Integer> odd = new PriorityQueue<>((o1, o2) -> o2 - o1);

        char[] data = String.valueOf(num).toCharArray();
        int result = 0;

        for(char c : data) {
            if((c - '0') % 2 == 0) even.add(c - '0');
            else odd.add(c - '0');
        }

        for(int i=0 ; i<data.length ; i++) {
            if((data[i] - '0') % 2 == 0) result += Math.pow(10, data.length-1-i) * even.remove();
            else result += Math.pow(10, data.length-1-i) * odd.remove();
        }

        return result;
    }
}
