package D20210727;

/**
 * 208. Implement Trie (Prefix Tree)
 */
public class Q0208 {
}

class Trie {

    private static class Node {
        boolean val;
        Node[] links = new Node[26];
    }

    private Node root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node curr = root;
        for(int i=0 ; i<word.length() ; i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.links[idx] == null) curr.links[idx] = new Node();
            if(i == word.length()-1) curr.links[idx].val = true;

            curr = curr.links[idx];
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node curr = root;
        for(int i=0 ; i<word.length() ; i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.links[idx] == null) return false;
            if(i == word.length()-1 && curr.links[idx].val) return true;

            curr = curr.links[idx];
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0 ; i<prefix.length() ; i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.links[idx] == null) return false;
            else curr = curr.links[idx];
        }
        return true;
    }
}

