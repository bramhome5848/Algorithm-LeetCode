package D20211122;

import java.util.*;

/**
 * 1331. Rank Transform of an Array
 */
public class Q1331 {

    public int[] arrayRankTransform1(int[] arr) {

        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[arr.length];
        int rank = 1;

        for(int value : arr) set.add(value);
        for(int value : set) map.put(value, rank++);
        for(int i=0 ; i<arr.length ; i++) result[i] = map.get(arr[i]);

        return result;
    }

    public int[] arrayRankTransform2(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = arr.clone();
        int rank = 1;

        Arrays.sort(result);

        for(int value : result) {
           if(!map.containsKey(value)) map.put(value, rank++);
        }

        for(int i=0 ; i<arr.length ; i++) arr[i] = map.get(arr[i]);

        return arr;
    }
}
