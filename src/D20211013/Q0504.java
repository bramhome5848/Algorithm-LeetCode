package D20211013;

/**
 * 504. Base 7
 */
public class Q0504 {

    public String convertToBase7(int num) {

        if(num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        int value = Math.abs(num);

        while(value > 0) {
            sb.append(value % 7);
            value /= 7;
        }

        return num < 0 ? sb.reverse().insert(0, '-').toString() : sb.reverse().toString();
    }
}
