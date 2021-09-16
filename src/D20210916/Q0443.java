package D20210916;

/**
 * 443. String Compression
 */
public class Q0443 {

    public int compress(char[] chars) {

        int i = 0;
        int idx = 0;

        while(i < chars.length){
            int j = i+1;
            while(j<chars.length && chars[i] == chars[j]) j++;

            chars[idx++] = chars[i];
            String count = Integer.toString(j-i);

            if(j-i > 1) {
                for(char c: count.toCharArray()) chars[idx++] = c;
            }
            i = j;
        }

        return idx;
    }
}
