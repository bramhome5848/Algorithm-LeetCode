package D20220712;

/**
 * 1812. Determine Color of a Chessboard Square
 */
public class Q1812 {

    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) - '0' + coordinates.charAt(1) - 'a' + 1) % 2 != 0;
    }
}
