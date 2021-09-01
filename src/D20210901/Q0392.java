package D20210901;

public class Q0392 {

    public boolean isSubsequence(String s, String t) {

        if(s.length() > t.length()) return false;

        for(char c : s.toCharArray()) {
            if(!t.contains(String.valueOf(c))) return false;
            int idx = t.indexOf(String.valueOf(c));
            t = t.substring(idx+1);
        }

        return true;
    }
}
