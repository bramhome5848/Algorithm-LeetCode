package D20220103;

/**
 * 1385. Find the Distance Value Between Two Arrays
 */
public class Q1385 {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;

        for(int value1 : arr1) {
            boolean flag = true;
            for(int value2 : arr2) {
               if(Math.abs(value1 - value2) <= d) {
                   flag = false;
                   break;
               }
            }

            if(!flag) count++;
        }

        return arr1.length - count;
    }
}
