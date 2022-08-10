package D20220810;

import java.util.ArrayList;
import java.util.List;

/**
 * 2194. Cells in a Range on an Excel Sheet
 */
public class Q2194 {

    public List<String> cellsInRange(String s) {

        List<String> result = new ArrayList<>();
        String[] data = s.split(":");

        char sCol = data[0].charAt(0);
        char sRow = data[0].charAt(1);
        char eCol = data[1].charAt(0);
        char eRow = data[1].charAt(1);

        for(int i=sCol ; i<eCol+1 ; i++) {
            for(int j=sRow ; j<eRow+1 ; j++) {
                result.add(String.valueOf((char) i) + (char) j);
            }
        }

        return result;
    }
}
