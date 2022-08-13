package D20220813;

/**
 * 2259. Remove Digit From Number to Maximize Result
 */
public class Q2259 {

    public String removeDigit(String number, char digit) {

        StringBuilder sb = new StringBuilder(number);
        int idx = 0;

        //여러개가 존재할 경우
        //먼저 발견된 숫자 바로 뒤의 숫자가 큰 경우 return
        for(int i=0 ; i<sb.length()-1 ; i++) {
            if(sb.charAt(i) == digit) {
                idx = i;
                if(sb.charAt(i) - '0' < sb.charAt(i+1) - '0') {
                    sb.deleteCharAt(i);
                    return sb.toString();
                }
            }
        }

        //마지막 idx 에 1개가 존재하는 경우
        if(sb.charAt(sb.length() - 1) == digit) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }

        //중복되는 숫자가 붙어 있는 경우 1개만 삭제
        sb.deleteCharAt(idx);
        return sb.toString();
    }
}
