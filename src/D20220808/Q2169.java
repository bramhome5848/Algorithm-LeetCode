package D20220808;

/**
 * 2169. Count Operations to Obtain Zero
 */
public class Q2169 {

    public int countOperations(int num1, int num2) {

        int result = 0;

        while(num1 > 0 && num2 > 0) {
            if(num1 >= num2) num1 -= num2;
            else num2 -= num1;

            result++;
        }

        return result;
    }
}
