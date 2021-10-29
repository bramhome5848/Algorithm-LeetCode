package D20211029;

/**
 * 693. Binary Number with Alternating Bits
 */
public class Q0693 {

    public boolean hasAlternatingBits1(int n) {

        String s = Integer.toBinaryString(n);

        for(int i=0 ; i<s.length()-1 ; i++) {
            if(s.charAt(i) == s.charAt(i+1)) return false;
        }

        return true;
    }

    public boolean hasAlternatingBits2(int n) {

        int a;
        int b;

        while(n != 0) {
            a = n & 1;
            n >>= 1;
            b = n & 1;
            if(a == b) return false;
        }
        return true;
    }
}
