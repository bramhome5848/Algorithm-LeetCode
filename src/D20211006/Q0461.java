package D20211006;

/**
 * 461. Hamming Distance
 */
public class Q0461 {

    public int hammingDistance(int x, int y) {

        int count = 0;

        while(x > 0 || y > 0){
            if(((x & 1) ^ (y & 1)) == 1) count++;
            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}
