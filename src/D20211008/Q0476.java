package D20211008;

/**
 * 476. Number Complement
 */
public class Q0476 {

    public int findComplement(int num) {
        return num ^ ((1<<Integer.toBinaryString(num).length()) - 1);
    }
}
