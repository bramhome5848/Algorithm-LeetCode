package D20210830;

/**
 * 374. Guess Number Higher or Lower
 */
public class Q0374 extends GuessGame {

    public int guessNumber(int n) {

        int s = 1;
        int e = n;

        while(s <= e) {

            int middle = s + (e-s)/2;
            int m = s+(e-s)/2;

            if(guess(m) == 0) return m;
            else if(guess(m) == 1) s = m+1;
            else e = m-1;
        }

        return -1;
    }
}

class GuessGame {
    public int guess(int num) {
        return 0;
    }
}
