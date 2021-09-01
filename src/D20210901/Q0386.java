package D20210901;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * 386. Lexicographical Numbers
 * O(n) time and uses O(1) extra space.
 */
public class Q0386 {

    //sorting
    public List<Integer> lexicalOrder1(int n) {
       String[] data = new String[n];
       for(int i=1 ; i<n+1 ; i++) {
           data[i-1] = Integer.toString(i);
       }

       Arrays.sort(data);
       return Arrays.stream(data).map(Integer::parseInt).collect(Collectors.toList());
    }

    //stack
    public List<Integer> lexicalOrder2(int n) {

        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=9 ; i>0 ; i--) {
            if(i < n+1) stack.add(i);
        }

        while(!stack.isEmpty()) {
            int value = stack.pop();
            result.add(value);

            if(value < n) {
                for(int i=9 ; i>-1 ; i--) {
                    int next = value * 10 + i;
                    if(next < n+1) stack.add(next);
                }
            }
        }

        return result;
    }
}
