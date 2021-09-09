package D20210909;

/**
 * 421. Maximum XOR of Two Numbers in an Array
 */
public class Q0421 {

    public static class TrieNode {
        TrieNode[] children;
        TrieNode(){
            children = new TrieNode[2];
        }
    }

    // == 1
    // != 0
    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        for(int num : nums) insert(root, num);

        int ans = 0;

        for(int num : nums) {
           int compare = Integer.MAX_VALUE ^ num;
           int result = find(root, compare);
           ans = Math.max(ans, result ^ num);
        }

        return ans;
    }

    private void insert(TrieNode root, int num) {
        TrieNode curr = root;
        int bitIdx = 31;

        while(bitIdx-- >= 0) {
            int mask = 1<<bitIdx;
            int bit = (num&mask) == 0 ? 0 : 1;

            TrieNode node = curr.children[bit];
            if(node == null) {
                node = new TrieNode();
                curr.children[bit] = node;
            }

            curr = node;
        }
    }

    private int find(TrieNode root, int num) {

        TrieNode curr = root;
        int bitIdx = 31;
        int result  = 0;

        while(bitIdx-- >= 0) {
            int mask = (1<<bitIdx);
            int bit = (num & mask) == 0 ? 0 : 1;
            TrieNode node = curr.children[bit];

            if(bit == 0) {
                if(node == null) {
                    node = curr.children[1];
                    result |= mask;
                }
            } else {
                if(node == null) node = curr.children[0];
                else result |= mask;
            }

            curr = node;
        }
        return result;
    }
}


