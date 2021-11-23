package D20211123;

/**
 * 1342. Number of Steps to Reduce a Number to Zero
 */
public class Q1342 {

    public int numberOfSteps1(int num) {

        int count = 0;

        while(num != 0) {
            if(num % 2 == 0) num /= 2;
            else num--;
            count++;
        }

        return count;
    }

    public int numberOfSteps2(int num) {

        int count = 0;

        while(num != 0) {
            if((num & 1) == 0) num >>= 1;
            else num ^= 1;
            count++;
        }

        return count;
    }
}
