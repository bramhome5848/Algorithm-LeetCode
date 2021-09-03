package D20210903;


public class Q0397 {

    public int integerReplacement(int n) {

        if(n == Integer.MAX_VALUE) return 32;
        else if(n < 4) return n-1;

        int count = 0;

        while(n > 1){

            if(n%2 == 0) n /= 2;
            else {
                if((n+1) % 4==0 && n != 3) n++;
                else n--;
            }
            count++;
        }
        return count;
    }
}
