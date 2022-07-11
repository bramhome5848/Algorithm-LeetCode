package D20220711;


import java.util.TreeSet;

/**
 * 1796. Second Largest Digit in a String
 */
public class Q1796 {

    public static int secondHighest(String s) {

        TreeSet<Integer> set = new TreeSet<>((t1, t2) -> t2 - t1);

        for(char c : s.toCharArray()) {
           if(Character.isDigit(c)) set.add(c - '0');
        }

        set.pollFirst();
        return set.isEmpty() ? -1 : set.first();
    }
}
