package D20211029;

/**
 * 657. Robot Return to Origin
 */
public class Q0657 {

    public boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;

        for(char c : moves.toCharArray()) {
           if(c == 'L') x--;
            else if(c == 'R') x++;
            else if(c == 'U') y--;
            else y++;
        }

        return x == 0 && y == 0;
    }
}
