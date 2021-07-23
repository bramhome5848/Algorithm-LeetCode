package D20210723;

/**
 * 167. Two Sum II - Input array is sorted
 */
public class Q0167 {

    public int[] twoSum(int[] numbers, int target) {

        int indexA = 0;
        int indexB = numbers.length - 1;

        while(indexA < indexB) {

            if(numbers[indexA] + numbers[indexB] < target) {
                indexA++;
            } else if(numbers[indexA] + numbers[indexB] > target) {
                indexB--;
            } else break;
        }

        return new int[]{indexA+1, indexB+1};
    }
}
