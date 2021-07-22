package D20210722;

/**
 * 165. Compare Version Numbers
 */
public class Q0165 {

    public int compareVersion(String version1, String version2) {

        String[] data1 = version1.split("\\.");
        String[] data2 = version2.split("\\.");

        int idxA = 0;
        int idxB = 0;

        while(idxA < data1.length || idxB < data2.length) {

            int valueA = idxA < data1.length ? Integer.parseInt(data1[idxA]) : 0;
            int valueB = idxB < data2.length ? Integer.parseInt(data2[idxB]) : 0;

            if(valueA != valueB) {
                if(valueA > valueB) return 1;
                else return -1;
            }

            idxA++;
            idxB++;
        }

        return 0;
    }
}
