package D20211123;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1346. Check If N and Its Double Exist
 */
public class Q1346 {

    public boolean checkIfExist1(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for(int num : arr) {
            if(set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) return true;
            set.add(num);
        }

        return false;
    }

    public boolean checkIfExist2(int[] arr) {

        for(int i=0 ; i<arr.length ; i++) {
            for(int j=i+1 ; j<arr.length ; j++) {
                if(arr[i] == 2 * arr[j] || 2 * arr[i] == arr[j]) return true;
            }
        }
        return false;
    }
}
