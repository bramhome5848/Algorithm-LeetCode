package D20210831;

/**
 * 383. Ransom Note
 */
public class Q0383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length()) return false;

        int[] freq = new int[26];

        for(char c : magazine.toCharArray()) freq[c - 'a']++;
        for(char c : ransomNote.toCharArray()) {
           if(freq[c - 'a'] == 0) return false;
           freq[c - 'a']--;
        }

        return true;
    }
}
