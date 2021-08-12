package D20210812;

/**
 * 331. Verify Preorder Serialization of a Binary Tree
 */
public class Q0331 {

    //{9, 3, 4, #, #, 1, #, #, 2, #, 6, #, #}
    public boolean isValidSerialization(String preorder) {

        int diff = 0;
        int index = 0;
        String[] nodes = preorder.split(",");

        while(index < nodes.length) {
            diff = nodes[index++].equals("#") ? diff+1 : diff-1;
            if(diff >= 2) return false;
            if(diff == 1) break;
        }

        return diff == 1 && index == nodes.length;
    }
}
