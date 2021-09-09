package D20210909;

/**
 * 423. Reconstruct Original Digits from English
 */
public class Q0423 {

    /**
     * 각 숫자에 하나씩만 나오는 문자 check
     *  z(zero)
     *  x(six)
     *  u(four)
     *  w(two)
     *  g(eight)
     *  f(four, five)
     *  O(zero, one, two, four)
     *  t(two, three, eight)
     *  s(six, seven)
     *  i(five, six, eight, nine)
     */
    public String originalDigits(String s) {

        int[] freq = new int[26];
        for(char c : s.toCharArray()) freq[c - 'a']++;

        int[] digit = new int[10];
        StringBuilder result = new StringBuilder();

        digit[0] = freq['z'-'a'];
        digit[6] = freq['x'-'a'];
        digit[4] = freq['u'-'a'];
        digit[2] = freq['w'-'a'];
        digit[8] = freq['g'-'a'];
        digit[5] = freq['f'-'a'] - digit[4];
        digit[7] = freq['s'-'a'] - digit[6];
        digit[3] = freq['t'-'a'] - digit[8] - digit[2];
        digit[1] = freq['o'-'a'] - digit[2] - digit[4] - digit[0];
        digit[9] = freq['i'-'a'] - digit[5] - digit[6] - digit[8];

        for(int i=0 ; i<10 ; i++){
            int count = digit[i];
            while(count-- > 0){
                result.append(i);
            }
        }
        return result.toString();
    }
}
