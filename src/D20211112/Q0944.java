package D20211112;

/**
 * 944. Delete Columns to Make Sorted
 */
public class Q0944 {

    public int minDeletionSize(String[] strs) {

        int result = 0;

        for(int j=0 ; j<strs[0].length() ; j++) {
            char prev = 96;
            for(String str : strs) {
               if(str.charAt(j) < prev) {
                   result++;
                   break;
               }
               prev = str.charAt(j);
            }
        }

        return result;
    }
}
