package D20210630;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 79. Word Search
 */
public class Q0079 {

    public boolean exist(char[][] board, String word) {

        for(int i=0 ; i<board.length ; i++) {
            for(int j=0 ; j<board[0].length ; j++) {
                if(word.charAt(0) == board[i][j]) {
                    if(dfsSearch(i, j, 0, board, word)) return true;
                }
            }
        }
        return false;
    }

    public boolean dfsSearch(int x, int y, int depth, char[][] board, String word) {

        if(depth == word.length()) return true;
        if(x<0 || board.length-1<x || y<0 || board[0].length-1<y) return false;
        if(board[x][y] != word.charAt(depth)) return false;
        
        char value = board[x][y];
        board[x][y] = '%';  //방문한 경우 -> 특수값 일시적 저장
        boolean search = dfsSearch(x, y+1, depth+1, board, word)
                || dfsSearch(x, y-1, depth+1, board, word)
                || dfsSearch(x-1, y, depth+1, board, word)
                || dfsSearch(x+1, y, depth+1, board, word);
        board[x][y] = value;

        return search;
    }
}
