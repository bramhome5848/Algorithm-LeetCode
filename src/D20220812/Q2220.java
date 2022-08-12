package D20220812;

/**
 * 2220. Minimum Bit Flips to Convert Number
 */
public class Q2220 {

    public int minBitFlips1(int start, int goal) {

        StringBuilder s = new StringBuilder(Integer.toBinaryString(start));
        StringBuilder e = new StringBuilder(Integer.toBinaryString(goal));
        int result = 0;

        if(s.length() != e.length()) {
            String repeat = "0".repeat(Math.abs(s.length() - e.length()));

            if(s.length() < e.length()) s.insert(0, repeat);
            else e.insert(0, repeat);
        }

        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) != e.charAt(i)) result++;
        }

        return result;
    }

    public static int minBitFlips2(int start, int goal) {

        int result = 0;

        while(start != goal) {

            if((start & 1) != (goal & 1)) result++;

            start >>= 1;    //right 1bit move
            goal >>= 1;     //right 1bit move
        }

        return result;
    }
}
