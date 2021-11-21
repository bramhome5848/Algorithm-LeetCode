package D20211121;

/**
 * 1287. Element Appearing More Than 25% In Sorted Array
 */
public class Q1287 {

    public int findSpecialInteger(int[] arr) {

        if(arr.length == 1) return arr[0];

        int freq = arr.length / 4;
        int count = 1;
        int num = arr[0];

        for(int i=1 ; i<arr.length ; i++) {
            if(num == arr[i]) count++;
            else {
                count = 1;
                num = arr[i];
            }

            if(count > freq) return num;
        }

        return 0;
    }
}
