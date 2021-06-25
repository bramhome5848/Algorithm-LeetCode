package D20210625;

import java.util.Arrays;

/**
 * 31. Next Permutation
 */
public class Q0031 {

    public void nextPermutation(int[] nums) {
        //뒤에서부터 감소하는 순열의 끝이 어디인지 찾기
        int i = nums.length-1;
        while (i > 0 && nums[i-1] >= nums[i]) {
            i -= 1;
        }

        // 다음에 더 큰 순열이 없는 경우 가장 작은 수 return
        if (i <= 0) {
            Arrays.sort(nums);
            return;
        }

        int j = nums.length-1;
        while (nums[j] <= nums[i-1]) {
            j -= 1;
        }

        //i-1과 j를 swap
        int temp = nums[i-1];
        nums[i-1] = nums[j];
        nums[j] = temp;

        //i부터 끝까지 순열을 뒤집는다
        j = nums.length-1;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
