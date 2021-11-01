package D20211101;

/**
 * 717. 1-bit and 2-bit Characters
 */
public class Q0717 {

    public boolean isOneBitCharacter(int[] bits) {

        int idx = 0;

        while(idx < bits.length-1) {
            if(bits[idx] == 1) idx += 2;
            else idx++;
        }

        return idx == bits.length-1;
    }
}
