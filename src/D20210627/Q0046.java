package D20210627;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 46. Permutations
 */
public class Q0046 {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        do {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        } while(getNextPermutation(nums));

        return result;
    }

    //다음 순열을 구하는 함수
    public boolean getNextPermutation(int[] data) {
        //뒤에서부터 감소하는 순열의 끝이 어디인지 찾기
        int i = data.length-1;
        while (i > 0 && data[i-1] >= data[i]) {
            i -= 1;
        }

        // 다음에 더 큰 순열이 없는 경우  return false
        if (i <= 0) {
            return false;
        }

        int j = data.length-1;
        while (data[j] <= data[i-1]) {
            j -= 1;
        }

        //i-1과 j를 swap
        int temp = data[i-1];
        data[i-1] = data[j];
        data[j] = temp;

        //i부터 끝까지 순열을 뒤집는다
        j = data.length-1;
        while (i < j) {
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}
