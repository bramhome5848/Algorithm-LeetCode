package D20211028;

/**
 * 605. Can Place Flowers
 */
public class Q0605 {

    public boolean canPlaceFlowers1(int[] flowerbed, int n) {

        int count = 0;
        int length = flowerbed.length;

        for(int i=0 ; i<length ; i++) {
            if(flowerbed[i] == 0 &&
                    (i==0 || flowerbed[i-1] == 0) &&
                    (i==length-1 || flowerbed[i+1] ==0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }
}
