package D20211117;

import java.util.LinkedList;

/**
 * 1089. Duplicate Zeros
 */
public class Q1089 {

    public void duplicateZeros(int[] arr) {

        LinkedList<Integer> que = new LinkedList<>();

        for(int i=0 ; i<arr.length ; i++) {
            que.addFirst(arr[i]);
            if(!que.isEmpty() && que.peek() == 0) que.addFirst(0);
            arr[i] = que.removeLast();
        }
    }
}
