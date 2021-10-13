package D20211013;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 507. Perfect Number
 */
public class Q0507 {

    public boolean checkPerfectNumber3(int num) {
        List<Integer> result = List.of(6, 28, 496, 8128, 33550336);
        return result.contains(num);
    }

    public boolean checkPerfectNumber2(int num) {

        int sum = 0;
        for(int i=num/2 ; i>0 ; i--) if(num%i == 0) sum += i;
        return sum == num;
    }

    public boolean checkPerfectNumber1(int num) {
        Set<Integer> set = new HashSet<>();

        for(int i=num/2 ; i>0 ; i--) if(num%i == 0) set.add(i);
        return set.stream().mapToInt(s -> s).sum() == num;
    }
}
