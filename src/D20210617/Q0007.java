package D20210617;

/**
 * 7. Reverse Integer
 */
public class Q0007 {

    public int reverse1(int x) {

        boolean minus = false;
        int result = 0;

        if(x < 0) {
            minus = true;
            x *= -1;
        }

        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();
        try {
            result = Integer.parseInt(sb.toString());
        } catch(Exception e) {
            result = 0;
        }

        return !minus ? result : -1 * result;
    }

    public int reverse2(int x) {
        int ans = 0;
        while (x != 0) {
            if(ans > 214748364 || ans < -214748364) return 0;
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans;
    }
}
