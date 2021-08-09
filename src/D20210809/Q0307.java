package D20210809;

public class Q0307 {
}

class NumArray {

    private int[] tree;
    private int n;

    public NumArray(int[] nums) {
        this.n = nums.length;
        tree = new int[2 * n];

        System.arraycopy(nums, 0, tree, n, n);
        for(int i=n-1 ; i>0 ; i--) tree[i] = tree[i*2] + tree[i*2+1];
    }

    public void update(int index, int val) {
        index += n;
        tree[index]=val;
        index /= 2;

        while(index > 0){
            tree[index] = tree[index*2] + tree[index*2+1];
            index /= 2;
        }
    }

    public int sumRange(int left, int right) {
        left += n;
        right += n;
        int sum = 0;

        while(right >= left){
            if(left % 2 == 1) sum += tree[left++];
            if(right % 2 == 0) sum += tree[right--];

            left /= 2;
            right /= 2;
        }
        return sum;
    }
}
