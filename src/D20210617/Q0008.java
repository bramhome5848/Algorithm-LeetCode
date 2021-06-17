package D20210617;

public class Q0008 {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(myAtoi("2147483857"));
    }
    public static int myAtoi(String s) {

        s = s.trim();
        boolean isPositive = true;

        int res = 0;
        int start = 0;
        if (s.startsWith("-")) {
            isPositive = false;
            start = 1;
        } else if (s.startsWith("+")) {
            start = 1;
        }
        for (int i = start; i < s.length(); ++i) {
            int num = s.charAt(i) - '0';
            if (num >= 0 && num < 10) {
                if ((Integer.MAX_VALUE - num) / 10 < res) {
                    if (isPositive) return Integer.MAX_VALUE;
                    return Integer.MIN_VALUE;
                }
                res = res * 10 + num;
            } else break;
        }

        if (isPositive) return res;
        return (-1) * res;
    }
}
