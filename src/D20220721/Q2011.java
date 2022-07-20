package D20220721;

/**
 * 2011. Final Value of Variable After Performing Operations
 */
public class Q2011 {

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for(String operation : operations) {
            if(operation.charAt(1) == '+') result++;
            else result--;
        }

        return result;
    }
}
