package D20210830;

/**
 * 372. Super Pow
 */
public class Q0372 {

    private static final int mod = 1337;

    public int superPow(int a, int[] b) {

        if(b == null || b.length == 0) return 0;
        int ans = 1;
        a = a % mod;

        for (int value : b) {
            ans = (pow(ans, 10) * pow(a, value)) % mod;
        }
        return ans;
    }

    private int pow(int a, int b){
        if(b==1) return a;
        else if(b==0) return 1;

        int x = pow(a,b/2);
        x = (x * x) % mod;

        if((b & 1) == 1) x = (x*a) % mod;

        return x;
    }
}
