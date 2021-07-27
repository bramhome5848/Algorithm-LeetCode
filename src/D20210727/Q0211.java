package D20210727;

/**
 * 211. Design Add and Search Words Data Structure
 */
public class Q0211 {
}

class WordDictionary {

    private static class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            children = new TrieNode[26];
        }
    }

    private TrieNode root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()) {
            if(curr.children[c - 'a'] == null) curr.children[c - 'a'] = new TrieNode();
            curr = curr.children[c - 'a'];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        return search(root, word, 0);
    }

    private boolean search(TrieNode root, String word, int idx) {
        TrieNode curr = root;

        for(int i=idx ; i<word.length() ; i++) {
            char c = word.charAt(i);

            if(c != '.') {
                if(curr.children[c - 'a'] == null) return false;
                curr = curr.children[c - 'a'];
            } else {
                for(TrieNode child : curr.children) {
                    if(child != null) {
                        if(search(child, word, i+1)) return true;
                    }
                }
                return false;
            }
        }
        return curr.isEnd;
    }
}


