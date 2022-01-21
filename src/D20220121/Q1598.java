package D20220121;

/**
 * 1598. Crawler Log Folder
 */
public class Q1598 {

    public int minOperations(String[] logs) {

        int depth = 0;

        for(String log : logs) {
           if(!log.equals("../") && !log.equals("./")) depth++;
           else if(log.equals("../")) depth = Math.min(0, depth - 1);
        }

        return depth;
    }
}
