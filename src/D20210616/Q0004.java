package D20210616;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 4. Median of Two Sorted Arrays
 */
public class Q0004 {

    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {

        PriorityQueue<Integer> que = new PriorityQueue<>();
        int total = nums1.length + nums2.length;
        double result = 0;
        Arrays.stream(nums1).forEach(que::add);
        Arrays.stream(nums2).forEach(que::add);

        if(total % 2 == 1) {
            for(int i=0 ; i<total/2 ; i++) {
                que.poll();
            }
            result = (double)que.poll();
        } else {
            for(int i=0 ; i<total/2-1 ; i++) {
                que.poll();
            }
            result = ((double)que.poll() + (double)que.poll()) / 2;
        }

        return result;
    }

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {

        int[] data = new int[nums1.length + nums2.length];
        boolean isEven = (nums1.length + nums2.length) % 2 == 0;
        int mid = data.length / 2;

        int index1 = 0;
        int index2 = 0;
        int index = 0;

        while(index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] <= nums2[index2]) data[index++] = nums1[index1++];
            else data[index++] = nums2[index2++];
        }

        while (index1 < nums1.length) {
            data[index++] = nums1[index1++];
        }

        while (index2 < nums2.length) {
            data[index++] = nums2[index2++];
        }
        if (isEven) return ((double)(data[mid-1] + data[mid])) / 2;
        else return data[mid];
    }
}
