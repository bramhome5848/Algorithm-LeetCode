package D20210701;

/**
 * 88. Merge Sorted Array
 */
public class Q0088 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;

        for(int k=m+n-1 ; k>-1 ; k--) {
            if(j==-1 || (i>-1 && nums1[i] > nums2[j])) {
                nums1[k] = nums1[i--];
            } else{
                nums1[k] = nums2[j--];
            }
        }
    }
}
