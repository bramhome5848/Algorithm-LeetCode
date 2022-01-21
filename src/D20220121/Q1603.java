package D20220121;

/**
 * 1603. Design Parking System
 */
public class Q1603 {
}

class ParkingSystem {

    int[] type = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        type[0] = big;
        type[1] = medium;
        type[2] = small;
    }

    public boolean addCar(int carType) {
        if(type[carType - 1] > 0) {
            type[carType - 1]--;
            return true;
        }
        return false;
    }
}
