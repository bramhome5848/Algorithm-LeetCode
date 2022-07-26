package D20220726;

/**
 * 2073. Time Needed to Buy Tickets
 */
public class Q2073 {

    public int timeRequiredToBuy(int[] tickets, int k) {
        // 5 4 3 9 10
        // 2 1 0 7 8
        // 3 3 3 2 2
        int result = 0;

        for(int i=0 ; i<tickets.length ; i++) {
            result += Math.min(tickets[i], tickets[k]);

            if(i>k && tickets[i] >= tickets[k]) result--;
        }

        return result;
    }
}
