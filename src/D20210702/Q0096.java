package D20210702;

/**
 * 96. Unique Binary Search Trees
 */
public class Q0096 {

    public int numTrees(int n) {
        if(n < 2) return 1;

        int[] result = new int[n+1];
        result[0] = 1;

        // n = 5, 트리의 루트가 될 수 있는 경우 5가지 -> 1, 2, 3, 4,5
        // root -> 1, 왼쪽 자식 없고, 오른쪽 n=4 인 트리
        // root -> 2, 왼쪽 자식 1 -> n=1, 오른쪽 자식 3,4,5 -> n=3
        // root -> 3, 왼쪽 자식 1,2 -> n=2, 오른쪽 자식 4,5 -> n=2
        for(int i=1 ; i<n+1 ; i++) {
            for(int j=0 ; j<i ; j++) {
                result[i] += result[j] * result[i-j-1];
            }
        }
        return result[n];
    }
}
