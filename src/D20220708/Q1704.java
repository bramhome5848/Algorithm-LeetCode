package D20220708;

import java.util.HashSet;
import java.util.Set;

/**
 * 1704. Determine if String Halves Are Alike
 */
public class Q1704 {

    public boolean halvesAreAlike(String s) {

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('i');
        set.add('u');
        set.add('o');
        set.add('e');
        set.add('A');
        set.add('I');
        set.add('U');
        set.add('O');
        set.add('E');

        int head = countContain(0, s.length() / 2, s, set);
        int tail = countContain(s.length() / 2, s.length(), s, set);

        return head == tail;
    }

    private int countContain(int s, int e, String data, Set<Character> set) {

        int count = 0;
        for(int i=s ; i<e ; i++) {
            if(set.contains(data.charAt(i))) count++;
        }

        return count;
    }
}

