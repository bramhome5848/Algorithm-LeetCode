package D20211007;

/**
 * 470. Implement Rand10() Using Rand7()
 */
public class Q0470 {

    public int rand7(){
        return 0;
    }

    public int rand10(){

        while(true){
            int x = rand7();
            int y = rand7();
            int val = 7 * (x-1) + y;

            if(val <= 10) return val;
        }
    }
}
